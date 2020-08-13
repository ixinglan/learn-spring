package com.zjq.dependencyinversion;

/**
 * Created by zjq 依赖倒置
 */
public class DependencyInversionTest {

    //v1
//    public static void main(String[] args) {
//        zjq zjq = new zjq();
//        zjq.studyJavaCourse();
//        zjq.studyPythonCourse();
//    }

    //v2
//    public static void main(String[] args) {
//        zjq zjq = new zjq();
//        zjq.study(new JavaCourse());
//        zjq.study(new PythonCourse());
//        zjq.study(new PythonCourse());
//    }

    //v3
//    public static void main(String[] args) {
//        zjq zjq = new zjq(new JavaCourse());
//        zjq.study();
//    }

    //v4
    public static void main(String[] args) {
        zjq zjq = new zjq();
        zjq.setCourse(new JavaCourse());
        zjq.study();

        zjq.setCourse(new PythonCourse());
        zjq.study();
    }


}
