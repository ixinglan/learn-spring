package com.zjq.factory.abstractfactory;

/**
 * @description:
 * @author:zhaojq
 */
public class PythonVideo implements Ivideo {
    @Override
    public void record() {
        System.out.println("录制python视频");
    }
}
