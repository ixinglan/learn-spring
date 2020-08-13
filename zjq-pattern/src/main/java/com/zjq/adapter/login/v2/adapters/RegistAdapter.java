package com.zjq.adapter.login.v2.adapters;

import com.zjq.adapter.login.ResultMsg;

public interface RegistAdapter {
    boolean support(Object adapter);
    ResultMsg login(String id, Object adapter);
}
