package com.zjq.factory.abstractfactory;

/**
 * @description:
 * @author:zhaojq
 */
public class Itest {
    public static void main(String[] args) {
        JavaCourseFactory factory = new JavaCourseFactory();
        factory.createNote().edit();
        factory.createVideo().record();
    }
}
