package com.test;

import com.account.AccountApplication;
import com.account.mapper.AccountMapper;
import com.account.service.AccountService;
import com.common.entity.AccountEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;


/**
 * @Description:
 * @Auther: zhurongsheng
 * @Date: 2020/3/22 19:18
 */
@RunWith(SpringRunner.class)
//主application方法
@SpringBootTest(classes= AccountApplication.class)
public class AccountTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void  test(){

        accountService.decrease(1,new BigDecimal(100));
    }
}
