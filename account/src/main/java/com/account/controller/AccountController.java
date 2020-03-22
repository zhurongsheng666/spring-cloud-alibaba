package com.account.controller;

import com.account.service.AccountService;
import com.common.pojo.ResponseResult;
import org.junit.jupiter.api.parallel.Execution;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @Description:
 * @Auther: zhurongsheng
 * @Date: 2020/3/22 18:54
 */
@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping(value = "/account/decrease")
    public ResponseResult decrease(@RequestParam("userId") Integer userID,
                                   @RequestParam("money") BigDecimal money) {
        ResponseResult fail = ResponseResult.fail("AccountController invoke decrease fail");
        try {
            if (accountService.decrease(userID, money)) {
                return ResponseResult.success("AccountController invoke decrease successs");
            }
            return fail;
        } catch (Exception e) {
            return fail;
        }
    }

}
