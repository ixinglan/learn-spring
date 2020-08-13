package com.zjq.factory.abstractfactory;

/**
 * @description:
 * @author:zhaojq
 */
public class JavaVideo implements Ivideo {
    @Override
    public void record() {
        System.out.println("录制java视频");
    }
}
