package com.zjq.compositereuse;

/**
 * Created by zjq
 */
public class MySQLConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "MySQL数据库连接";
    }
}
