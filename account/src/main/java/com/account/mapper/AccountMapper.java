package com.account.mapper;

import com.common.entity.AccountEntity;
import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.mapper.common.BaseMapper;

/**
 * @Description:
 * @Auther: zhurongsheng
 * @Date: 2020/3/22 18:54
 */
@Mapper
public interface AccountMapper extends BaseMapper<AccountEntity> {
}
