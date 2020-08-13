package com.zjq.dependencyinversion;

/**
 * Created by zjq
 */
public class AICourse implements ICourse {
    @Override
    public void study() {
        System.out.println("zjq在学习AI课程");
    }

}
