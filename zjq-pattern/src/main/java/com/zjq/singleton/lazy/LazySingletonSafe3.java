package com.zjq.singleton.lazy;

/**
 * @description: 静态内部类: 完美兼顾饿汉式内存浪费 和 synchronized性能问题
 * @author:zhaojq
 */
public class LazySingletonSafe3 {
    //默认使用LazySingletonSafe3的时候，会先初始化内部类
    //如果没使用的话，内部类是不加载的
    private LazySingletonSafe3() {
        //防止反射破坏单例,作判断
        if (LazyHolder.lazySingleton != null) {
            throw new RuntimeException("不能创建多个实例");
        }
    }

    //每一个关键字都不是多余的
    //static 是为了使单例的空间共享
    //保证这个方法不会被重写，重载
    public static LazySingletonSafe3 getInstance() {
        return LazyHolder.lazySingleton;
    }

    //默认不加载
    private static class LazyHolder {
        private static LazySingletonSafe3 lazySingleton = new LazySingletonSafe3();
    }
}
