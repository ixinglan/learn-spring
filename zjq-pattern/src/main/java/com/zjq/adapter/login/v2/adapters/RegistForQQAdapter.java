package com.zjq.adapter.login.v2.adapters;

import com.zjq.adapter.login.ResultMsg;

public class RegistForQQAdapter implements RegistAdapter,LoginAdapter {
    public boolean support(Object adapter) {
        return false;
    }

    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
