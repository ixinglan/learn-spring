package com.zjq.singleton.lazy;

/**
 * @description:
 * @author:zhaojq
 */
public class ExectorThread implements Runnable {
    @Override
    public void run() {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println(Thread.currentThread().getPriority() + ":" + lazySingleton);
    }
}
