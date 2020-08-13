package com.zjq.proxy.dynamicproxy.gpproxy;

import java.lang.reflect.Method;

/**
 * @description:
 * @author:zhaojq
 */
public interface GPInvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args) throws Exception;
}
