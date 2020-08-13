package com.zjq.factory.abstractfactory;

/**
 * @description: 抽象工厂类
 * @author:zhaojq
 */
public interface CourseFactory {
    Inote createNote();

    Ivideo createVideo();
}
