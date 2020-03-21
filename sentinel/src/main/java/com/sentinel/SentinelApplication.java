package com.sentinel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description:
 * @Auther: zhurongsheng
 * @Date: 2020/3/21 10:16
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SentinelApplication {

    public static void main(String[] args) {
        SpringApplication.run(SentinelApplication.class);
    }

}
