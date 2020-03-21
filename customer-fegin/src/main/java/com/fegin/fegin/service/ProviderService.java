package com.fegin.fegin.service;

import com.fegin.fegin.fallback.ProviderServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description:
 * @Auther: zhurongsheng
 * @Date: 2020/3/21 22:03
 */
@FeignClient(value = "provider",path = "/provider",fallback = ProviderServiceFallback.class)
@Service
public interface ProviderService {

    @GetMapping("/hello")
    String hello();

}
