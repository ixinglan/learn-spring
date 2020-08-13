package com.zjq.proxy.dbroute.db;

/**
 *
 */
public class DynamicDataSourceEntity {

    //默认数据源
    public final static String DEFAULE_SOURCE = null;

    private final static ThreadLocal<String> local = new ThreadLocal<String>();

    private DynamicDataSourceEntity() {
    }

    //获取当前
    public static String get() {
        return local.get();
    }

    //还原切换的
    public static void restore() {
        local.set(DEFAULE_SOURCE);
    }

    //DB_2018
    //DB_2019
    public static void set(String source) {
        local.set(source);
    }

    public static void set(int year) {
        local.set("DB_" + year);
    }

}
