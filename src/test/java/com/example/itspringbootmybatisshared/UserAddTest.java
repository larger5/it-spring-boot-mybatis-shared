package com.example.itspringbootmybatisshared;

import com.example.itspringbootmybatisshared.domain.UserInfo;
import com.example.itspringbootmybatisshared.service.UserInfoService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.math.BigDecimal;

@SpringBootTest
public class UserAddTest {
    @Resource
    UserInfoService userInfoService;

    @Test
    void addUserInfoTest() {
        UserInfo userInfo = new UserInfo();
        userInfo.setId(10000L);
        userInfo.setMoney(new BigDecimal("10.00"));
        userInfo.setName("中国电信");
        userInfoService.addUserInfo(userInfo);
    }
}
