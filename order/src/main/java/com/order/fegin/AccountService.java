package com.order.fegin;

import com.common.pojo.ResponseResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @Description:
 * @Auther: zhurongsheng
 * @Date: 2020/3/22 16:21
 */
@FeignClient(value = "account")
@Service
public interface AccountService {

    @PostMapping(value = "/account/decrease")
    ResponseResult decrease(@RequestParam("userId") Integer userID,
                            @RequestParam("money") BigDecimal money);

}
