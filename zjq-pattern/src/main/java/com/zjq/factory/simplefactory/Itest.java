package com.zjq.factory.simplefactory;

import com.zjq.factory.base.Icourse;
import com.zjq.factory.base.JavaCourse;
import com.zjq.factory.base.PythonCourse;

/**
 * @description: 简单工厂
 * @author:zhaojq
 */
public class Itest {
    public static void main(String[] args) {
        Icourse java = new JavaCourse();
        java.record();

        Icourse python = new PythonCourse();
        python.record();

        CourseFactory factory = new CourseFactory();
        Icourse icourse = factory.create("java");
        icourse.record();

        Icourse icourse2 = factory.create2("com.zjq.simplefactory.JavaCourse");
        icourse2.record();
    }
}
