package com.sentinel.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Auther: zhurongsheng
 * @Date: 2020/3/21 10:18
 */
@RestController
@RequestMapping("/flow")
public class FlowLimitController {

    @GetMapping("/a")
    public String a(){
        return "Hello a";
    }

    @GetMapping("/b")
    public String b(){
        return "Hello b";
    }

    @GetMapping("/c")
    public String c(){
        int a=5/0;
        return "Hello c";
    }
}
