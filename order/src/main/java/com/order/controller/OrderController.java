package com.order.controller;

import com.common.entity.OrderEntity;
import com.common.pojo.ResponseResult;
import com.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Auther: zhurongsheng
 * @Date: 2020/3/22 16:45
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/order")
    public ResponseResult order(@RequestBody OrderEntity order){
        try {
            orderService.create(order);
            return ResponseResult.success(order);
        }catch (Exception e){
            e.printStackTrace();
            return ResponseResult.fail("添加失败");
        }
    }
}
