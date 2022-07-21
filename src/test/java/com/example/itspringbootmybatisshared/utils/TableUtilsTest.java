package com.example.itspringbootmybatisshared.utils;

import org.junit.jupiter.api.Test;

public class TableUtilsTest {
    @Test
    public void getTabNameByIdTest() {
        System.out.println(TableUtils.getTabNameById(10086L));
    }
}
