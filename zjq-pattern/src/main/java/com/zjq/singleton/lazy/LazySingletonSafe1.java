package com.zjq.singleton.lazy;

/**
 * @description: 方法锁
 * @author:zhaojq
 */
public class LazySingletonSafe1 {
    private LazySingletonSafe1() {
    }

    private static LazySingletonSafe1 lazySingleton = null;

    public synchronized static LazySingletonSafe1 getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingletonSafe1();
        }
        return lazySingleton;
    }
}
