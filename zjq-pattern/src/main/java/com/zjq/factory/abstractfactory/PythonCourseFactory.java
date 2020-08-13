package com.zjq.factory.abstractfactory;

/**
 * @description:
 * @author:zhaojq
 */
public class PythonCourseFactory implements CourseFactory {
    @Override
    public Inote createNote() {
        return new PythonNote();
    }

    @Override
    public Ivideo createVideo() {
        return new PythonVideo();
    }
}
