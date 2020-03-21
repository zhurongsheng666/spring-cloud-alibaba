package com.fegin.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.fegin.fegin.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Auther: zhurongsheng
 * @Date: 2020/3/21 22:07
 */
@RestController
@RequestMapping("/fegin")
public class FeginController {

    @Autowired
    private ProviderService providerService;

    @GetMapping("/hello")
    @SentinelResource(value = "hello",blockHandler = "helloBlockHandler")
    public String hello(){
        return   providerService.hello();
    }
    public String helloBlockHandler(BlockException e){
        return "CustomerController invoke blockHandler";
    }

}
