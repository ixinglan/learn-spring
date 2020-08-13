package com.zjq.singleton.lazy;

/**
 * @description: 代码块锁
 * @author:zhaojq
 */
public class LazySingletonSafe2 {
    private LazySingletonSafe2() {
    }

    private static LazySingletonSafe2 lazySingleton = null;

    public static LazySingletonSafe2 getInstance() {
        if (lazySingleton == null) {
            synchronized (LazySingletonSafe2.class) {

                if (lazySingleton == null) lazySingleton = new LazySingletonSafe2();
            }
        }
        return lazySingleton;
    }
}
