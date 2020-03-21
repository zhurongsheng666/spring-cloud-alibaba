package com.nacos.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @Description:
 * @Auther: zhurongsheng
 * @Date: 2020/3/17 22:56
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private RestTemplate restTemplate;

    private final String SERVER_URL="http://provider";


    /**
     *  blockHandler：仅负责sentinel违规
     */
    @GetMapping(value = "/hello/{id}")
    @SentinelResource(value = "hello",blockHandler = "helloBlockHandler",fallback = "fallbackHandler")
    public String hello(@PathVariable("id") String id){
        if (id.equals("1")){
            throw new RuntimeException("id不能为1");
        }
        return restTemplate.getForObject(SERVER_URL+"/provider/hello", String.class);
    }

    public String fallbackHandler(@PathVariable("id") String id ,Throwable e){
        return "CustomerController invoke fallbackHandler";
    }

    public String helloBlockHandler(String id,BlockException e){
        return "CustomerController invoke blockHandler";
    }

}
