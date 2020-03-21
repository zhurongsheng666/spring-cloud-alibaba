package com.sentinel.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.sentinel.handler.ZrsBlockHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Auther: zhurongsheng
 * @Date: 2020/3/21 15:45
 */
@RestController
public class SentinelResourceController {


    @GetMapping("/resource")
    @SentinelResource(value = "resource",blockHandler = "handleException")
    public String resource(){
        return "SentinelResourceController invoke resource success";
    }

    public String handleException(BlockException e){
        return "SentinelResourceController invoke handleException";
    }


    @GetMapping("/handler1")
    @SentinelResource(value = "handler1Exception",blockHandlerClass = ZrsBlockHandler.class,
    blockHandler = "handler1Exception")
    public String handler1(){
        return "SentinelResourceController invoke resource success";
    }


    @GetMapping("/handler2")
    @SentinelResource(value = "handler2Exception",blockHandlerClass = ZrsBlockHandler.class,
            blockHandler = "handler2Exception")
    public String handler2(){
        return "SentinelResourceController invoke resource success";
    }

}
