package com.mybatis.test;

import com.common.entity.OrderEntity;
import com.order.OrderApplication;
import com.order.mapper.OrderMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

/**
 * @Description:
 * @Auther: zhurongsheng
 * @Date: 2020/3/22 19:14
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes= OrderApplication.class)
public class OrderMapperTest {

    @Autowired
    private OrderMapper orderMapper;

    @Test
    public void  orderTest(){
        OrderEntity order=new OrderEntity();
        order.setUserID(1);
        order.setProductID(1);
        order.setCount(2);
        order.setMoney(new BigDecimal(10));
        order.setStatus(0);
        orderMapper.insertSelective(order);
    }

}
