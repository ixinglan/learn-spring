package com.zjq.factory.simplefactory;

import com.zjq.factory.base.Icourse;
import com.zjq.factory.base.JavaCourse;
import com.zjq.factory.base.PythonCourse;

/**
 * @description:
 * @author:zhaojq
 */
public class CourseFactory {
    public Icourse create(String name) {
        if ("java".equals(name)) {
            return new JavaCourse();
        } else if ("python".equals(name)) {
            return new PythonCourse();
        }
        return null;
    }

    //利用反射
    public Icourse create2(String className) {
        if (!(null == className) || "".equals(className)) {
            try {
                return (Icourse) Class.forName(className).newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
