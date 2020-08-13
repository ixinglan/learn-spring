package com.zjq.liskovsubstitution.methodparam;

import java.util.HashMap;

/**
 * Created by zjq
 */
public class MethodParamTest {
    public static void main(String[] args) {
        Base child = new Child();
        HashMap hashMap = new HashMap();
        child.method(hashMap);
    }
}
