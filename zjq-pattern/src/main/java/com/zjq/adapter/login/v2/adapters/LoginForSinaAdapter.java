package com.zjq.adapter.login.v2.adapters;

import com.zjq.adapter.login.ResultMsg;

public class LoginForSinaAdapter implements LoginAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForSinaAdapter;
    }
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
