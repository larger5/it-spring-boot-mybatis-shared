package com.example.itspringbootmybatisshared.service.impl;

import com.example.itspringbootmybatisshared.domain.UserInfo;
import com.example.itspringbootmybatisshared.mapper.UserInfoMapper;
import com.example.itspringbootmybatisshared.service.UserInfoService;
import com.example.itspringbootmybatisshared.utils.TableUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 用户Service层实现
 *
 * @author hongcunlin
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {
    /**
     * 用户mapper层
     */
    @Resource
    private UserInfoMapper userInfoMapper;

    /**
     * 新增用户信息
     *
     * @param userInfo 用户信息
     */
    @Override
    public void addUserInfo(UserInfo userInfo) {
        userInfoMapper.addUserInfo(userInfo, TableUtils.getTabNameById(userInfo.getId()));
    }

    /**
     * 查询用户信息
     *
     * @param id 用户id
     * @return 用户信息
     */
    @Override
    public UserInfo getUserInfoById(Long id) {
        return userInfoMapper.getUserInfoById(id, TableUtils.getTabNameById(id));
    }
}
