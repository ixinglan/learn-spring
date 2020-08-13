package com.zjq.simpleresponsibility.interfaced;

/**
 * Created by zjq
 */
public interface ICourse {

    //获得基本信息
    String getCourseName();

    //获得视频流
    byte[] getCourseVideo();

    //学习课程
    void studyCourse();

    //退款
    void refundCourse();
}
