package com.zjq.dependencyinversion;

/**
 * Created by zjq
 */
public class PythonCourse implements ICourse {
    @Override
    public void study() {
        System.out.println("zjq在学习Python课程");
    }
}
