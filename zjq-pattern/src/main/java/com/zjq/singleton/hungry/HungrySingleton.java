package com.zjq.singleton.hungry;

/**
 * @description: 饿汉式 单例
 * 绝对线程安全,没有锁,执行效率高
 * 但一直占空间
 * @author:zhaojq
 */
public class HungrySingleton {
    //先静态,后动态 先属性,后方法  先上后下
    private static final HungrySingleton HUNGRY_SINGLETON = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return HUNGRY_SINGLETON;
    }
}
