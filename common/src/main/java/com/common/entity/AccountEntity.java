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
 * @Date: 2020/3/22 15:27
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "t_account")
public class AccountEntity {

    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    @Id
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "total")
    private BigDecimal total;

    @Column(name = "used")
    private BigDecimal used;

    @Column(name = "residue")
    private BigDecimal residue;
}
