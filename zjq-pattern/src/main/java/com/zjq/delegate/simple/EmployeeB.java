package com.zjq.delegate.simple;

/**
 * @description:
 * @author:zhaojq
 */
public class EmployeeB implements IEmployee {
    @Override
    public void doing(String command) {
        System.out.println("我是b,现在开始做: "+command);
    }
}
