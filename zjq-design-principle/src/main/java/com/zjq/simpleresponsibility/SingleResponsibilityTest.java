package com.zjq.simpleresponsibility;


import com.zjq.simpleresponsibility.simple.Course;
import com.zjq.simpleresponsibility.simple.LiveCourse;
import com.zjq.simpleresponsibility.simple.ReplayCourse;

/**
 * Created by zjq. 单一职责原则
 */
public class SingleResponsibilityTest {
    public static void main(String[] args) {
        Course course = new Course();
        course.study("直播课");
        course.study("录播课");

        LiveCourse liveCourse = new LiveCourse();
        liveCourse.study("直播课");

        ReplayCourse replayCourse = new ReplayCourse();
        replayCourse.study("录播课");


    }
}
