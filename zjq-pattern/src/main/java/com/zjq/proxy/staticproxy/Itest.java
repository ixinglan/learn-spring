package com.zjq.proxy.staticproxy;

/**
 * @description:
 * @author:zhaojq
 */
public class Itest {
    public static void main(String[] args) {
        Father father = new Father(new Son());
        father.findLove();
    }
}
