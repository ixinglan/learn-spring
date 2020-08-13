package com.zjq.singleton.lazy;

/**
 * @description:
 * @author:zhaojq
 */
public class LazySingleton {
    private LazySingleton() {
    }

    private static LazySingleton lazySingleton = null;

    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
