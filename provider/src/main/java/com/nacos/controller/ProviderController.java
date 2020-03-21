package com.nacos.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Auther: zhurongsheng
 * @Date: 2020/3/17 22:19
 */
@RestController
@RequestMapping("/provider")
public class ProviderController {

    @Value("${server.port}")
    private Integer port;

    @GetMapping("/hello")
    public String hello(){
        return "Hello nacos , server port is "+port;
    }
}
