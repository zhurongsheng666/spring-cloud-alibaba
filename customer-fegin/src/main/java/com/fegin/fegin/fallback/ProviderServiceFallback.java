package com.fegin.fegin.fallback;

import com.fegin.fegin.service.ProviderService;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Auther: zhurongsheng
 * @Date: 2020/3/21 22:05
 */
@Component
public class ProviderServiceFallback implements ProviderService {

    @Override
    public String hello() {
        return "ProviderServiceFallback invoke hello";
    }
}
