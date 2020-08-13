package com.zjq.delegate.simple;

/**
 * @description:
 * @author:zhaojq
 */
public class EmployeeA implements IEmployee {
    @Override
    public void doing(String command) {
        System.out.println("我是a,现在开始做: "+command);
    }
}
