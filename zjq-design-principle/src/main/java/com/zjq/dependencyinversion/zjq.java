package com.zjq.dependencyinversion;

/**
 * Created by zjq
 */
public class zjq {

    private ICourse course;

//    public zjq(ICourse course){
//        this.course = course;
//    }

    public void setCourse(ICourse course) {
        this.course = course;
    }

    public void study() {
        course.study();
    }


    public void studyJavaCourse() {
        System.out.println("zjq在学习Java的课程");
    }

    public void studyPythonCourse() {
        System.out.println("zjq在学习Python的课程");
    }


    public void study(ICourse course) {
        course.study();
    }

}
