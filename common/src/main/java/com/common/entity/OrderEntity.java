package com.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * @Description:
 * @Auther: zhurongsheng
 * @Date: 2020/3/22 15:12
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "t_order")
public class OrderEntity {

    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    @Id
    private Integer id;

    @Column(name = "user_id")
    private Integer userID;

    @Column(name = "product_id")
    private Integer productID;

    @Column(name = "count")
    private Integer count;

    @Column(name = "money")
    private BigDecimal money;

    /**
     * 0代表创建、1代表完成
     */
    @Column(name = "status")
    private Integer status;
}
