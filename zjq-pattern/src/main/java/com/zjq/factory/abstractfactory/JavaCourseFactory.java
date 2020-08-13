package com.zjq.factory.abstractfactory;

/**
 * @description:
 * @author:zhaojq
 */
public class JavaCourseFactory implements CourseFactory {
    @Override
    public Inote createNote() {
        return new JavaNote();
    }

    @Override
    public Ivideo createVideo() {
        return new JavaVideo();
    }
}
