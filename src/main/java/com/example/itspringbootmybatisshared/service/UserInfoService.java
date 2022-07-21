package com.example.itspringbootmybatisshared.service;

import com.example.itspringbootmybatisshared.domain.UserInfo;

/**
 * 用户Service层接口
 *
 * @author hongcunlin
 */
public interface UserInfoService {
    /**
     * 新增用户信息
     *
     * @param userInfo 用户信息
     */
    void addUserInfo(UserInfo userInfo);

    /**
     * 查询用户信息
     *
     * @param id 用户id
     * @return 用户信息
     */
    UserInfo getUserInfoById(Long id);
}
