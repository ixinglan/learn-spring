package com.zjq.proxy.dynamicproxy.jdk;

import java.lang.reflect.Method;

/**
 * @description:
 * @author:zhaojq
 */
public class Itest {
    public static void main(String[] args) throws Exception {
        Object obj = new JDKMeipo().getInstance(new Girl());
        Method method = obj.getClass().getMethod("findLove", null);
        method.invoke(obj);
        //obj.findLove();
    }
}
