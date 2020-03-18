package com.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:  @RefreshScope保持nacos动态刷新
 * @Auther: zhurongsheng
 * @Date: 2020/3/18 00:22
 */
@RestController
@RefreshScope
public class ConfigController {

    @Value("${config.info}")
    private String info;

    @GetMapping("/config/info")
    public String info(){
        return info;
    }

}
