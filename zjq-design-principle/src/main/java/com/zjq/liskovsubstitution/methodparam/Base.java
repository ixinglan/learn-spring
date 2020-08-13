package com.zjq.liskovsubstitution.methodparam;

import java.util.HashMap;

/**
 * Created by zjq
 */
public class Base {
    public void method(HashMap map) {
        System.out.println("父类被执行");
    }
}
