package com.zjq.adapter.login.v2.adapters;

import com.zjq.adapter.login.ResultMsg;

public class LoginForTelAdapter implements LoginAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTelAdapter;
    }
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
