package com.account.service;

import com.account.mapper.AccountMapper;
import com.common.entity.AccountEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @Description:
 * @Auther: zhurongsheng
 * @Date: 2020/3/22 18:55
 */
@Service
public class AccountService {

    @Autowired
    private AccountMapper acountMapper;


    public boolean decrease(Integer userID, BigDecimal money) {
        AccountEntity account=new AccountEntity();
        account.setUserId(userID);
        AccountEntity temp = acountMapper.selectOne(account);
        if (temp!=null && temp.getResidue().compareTo(money)>0){
            temp.setUsed(money.add(temp.getUsed()));
            temp.setResidue(temp.getResidue().subtract(money));
            acountMapper.updateByPrimaryKeySelective(temp);
            return true;
        }
        return false;
    }
}
