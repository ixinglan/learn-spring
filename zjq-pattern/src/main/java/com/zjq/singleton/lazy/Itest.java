package com.zjq.singleton.lazy;

/**
 * @description:
 * @author:zhaojq
 */
public class Itest {
    public static void main(String[] args) {
        //线程不安全
        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());
        t1.start();
        t2.start();
        System.out.println("end");
    }
}
