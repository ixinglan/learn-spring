package com.zjq.factory.base;

/**
 * @description:
 * @author:zhaojq
 */
public class PythonCourse implements Icourse {
    @Override
    public void record() {
        System.out.println("录制python视频");
    }
}
