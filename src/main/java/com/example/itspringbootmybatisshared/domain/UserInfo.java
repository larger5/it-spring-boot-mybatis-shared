package com.example.itspringbootmybatisshared.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 用户信息
 *
 * @author hongcunlin
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserInfo {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * 用户名
     */
    private String name;

    /**
     * 用户余额
     */
    private BigDecimal money;

    /**
     * 创建时间
     */
    private Date createTime = new Date();
}
