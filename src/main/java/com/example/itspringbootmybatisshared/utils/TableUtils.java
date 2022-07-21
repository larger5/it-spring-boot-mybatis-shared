package com.example.itspringbootmybatisshared.utils;

/**
 * 分表工具
 * 定位表
 *
 * @author hongcunlin
 */
public class TableUtils {
    /**
     * 表名基本组成部分
     */
    private static final String TAB_NAME_BASE = "user_info_";

    /**
     * 表数量
     */
    private static final Integer TAB_NUM = 8;

    /**
     * 根据id获取表名
     *
     * @param id 用户id
     * @return 表名
     */
    public static String getTabNameById(Long id) {
        return TAB_NAME_BASE + (id.hashCode() % TAB_NUM + 1);
    }
}
