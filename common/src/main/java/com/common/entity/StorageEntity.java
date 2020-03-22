package com.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Description:
 * @Auther: zhurongsheng
 * @Date: 2020/3/22 15:26
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "t_storage")
public class StorageEntity {

    @Column(name = "id")
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "total")
    private Integer total;

    @Column(name = "used")
    private Integer used;

    @Column(name = "residue")
    private Integer residue;
}
