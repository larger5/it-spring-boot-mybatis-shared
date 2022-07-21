package com.example.itspringbootmybatisshared;

import com.example.itspringbootmybatisshared.domain.UserInfo;
import com.example.itspringbootmybatisshared.service.UserInfoService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class UserQueryTest {
    @Resource
    UserInfoService userInfoService;

    @Test
    void getUserInfoTest() {
        UserInfo userInfo = userInfoService.getUserInfoById(10000L);
        System.out.println(userInfo);
    }
}
