package com.zjq.factory.factorymethod;

import com.zjq.factory.base.Icourse;
import com.zjq.factory.base.JavaCourse;

/**
 * @description:
 * @author:zhaojq
 */
public class JavaFactory implements ICourseFactory {
    public Icourse create() {
        return new JavaCourse();
    }
}
