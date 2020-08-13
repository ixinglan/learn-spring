package com.zjq.factory.factorymethod;

import com.zjq.factory.base.Icourse;
import com.zjq.factory.base.PythonCourse;

/**
 * @description:
 * @author:zhaojq
 */
public class PythonFactory implements ICourseFactory {
    public Icourse create() {
        return new PythonCourse();
    }
}
