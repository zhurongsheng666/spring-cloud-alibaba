package com.order.mapper;

import com.common.entity.OrderEntity;
import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.mapper.common.BaseMapper;

/**
 * @Description:
 * @Auther: zhurongsheng
 * @Date: 2020/3/22 16:12
 */
@Mapper
public interface OrderMapper extends BaseMapper<OrderEntity> {

}
