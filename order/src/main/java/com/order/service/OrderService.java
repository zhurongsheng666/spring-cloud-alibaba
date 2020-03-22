package com.order.service;

import com.common.entity.OrderEntity;
import com.common.pojo.ResponseResult;
import com.order.fegin.AccountService;
import com.order.fegin.StorageService;
import com.order.mapper.OrderMapper;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Auther: zhurongsheng
 * @Date: 2020/3/22 16:16
 */
@Service
@Slf4j
public class OrderService {


    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private StorageService storageService;

    @Autowired
    private AccountService accountService;


    @GlobalTransactional
    public void create(OrderEntity order){

        log.info("接收到【订单】:"+order.toString());

        log.info("【1】新建订单开始");
        orderMapper.insertSelective(order);

        log.info("【2】调取【库存微服务】进行商品扣减【开始】");
        storageService.decrease(order.getProductID(), order.getCount());

        log.info("【3】调取【账户微服务】进行金额的扣减【开始】");
        accountService.decrease(order.getUserID(), order.getMoney());

        int a=1/0;

        log.info("【4】 修改订单的状态开始");
        order.setStatus(1);
        orderMapper.updateByPrimaryKeySelective(order);

    }
}
