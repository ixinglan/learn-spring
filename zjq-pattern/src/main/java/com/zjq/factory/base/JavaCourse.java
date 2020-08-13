package com.zjq.factory.base;

/**
 * @description:
 * @author:zhaojq
 */
public class JavaCourse implements Icourse {
    @Override
    public void record() {
        System.out.println("录制java视频");
    }
}
