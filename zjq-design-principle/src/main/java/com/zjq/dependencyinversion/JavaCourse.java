package com.zjq.dependencyinversion;

/**
 * Created by zjq
 */
public class JavaCourse implements ICourse {

    @Override
    public void study() {
        System.out.println("zjq在学习Java课程");
    }
}
