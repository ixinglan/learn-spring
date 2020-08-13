package com.zjq.compositereuse;

/**
 * Created by zjq
 */
public class OracleConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "Oracle数据库连接";
    }
}
