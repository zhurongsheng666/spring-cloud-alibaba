package com.fegin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Description:
 * @Auther: zhurongsheng
 * @Date: 2020/3/21 22:01
 */
@EnableFeignClients
@SpringBootApplication
@EnableDiscoveryClient
public class FeginApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeginApplication.class);
    }
}
