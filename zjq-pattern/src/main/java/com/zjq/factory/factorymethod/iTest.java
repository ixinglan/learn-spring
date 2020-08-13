package com.zjq.factory.factorymethod;

import com.zjq.factory.base.Icourse;

/**
 * @description: 工厂方法模式: 用各自的实现工厂创建对象
 * @author:zhaojq
 */
public class iTest {
    public static void main(String[] args) {
        ICourseFactory factory = new JavaFactory();
        Icourse icourse = factory.create();
        icourse.record();

        factory = new PythonFactory();
        Icourse icourse1 = factory.create();
        icourse1.record();
    }
}
