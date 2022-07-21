package com.example.itspringbootmybatisshared.mapper;

import com.example.itspringbootmybatisshared.domain.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * @author hongcunlin
 */
@Mapper
@Component
public interface UserInfoMapper {
    /**
     * 新增用户
     *
     * @param userInfo  用户信息
     * @param tableName 表名
     */
    void addUserInfo(@Param("userInfo") UserInfo userInfo, @Param("tableName") String tableName);

    /**
     * 查询用户信息
     *
     * @param id        用户id
     * @param tableName 表名
     * @return 用户信息
     */
    UserInfo getUserInfoById(@Param("id") Long id, @Param("tableName") String tableName);
}
