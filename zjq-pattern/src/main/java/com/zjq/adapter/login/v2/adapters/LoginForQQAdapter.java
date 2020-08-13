package com.zjq.adapter.login.v2.adapters;


import com.zjq.adapter.login.ResultMsg;

public class LoginForQQAdapter implements LoginAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForQQAdapter;
    }

    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
