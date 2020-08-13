package com.zjq.prototype.simple;

import java.util.Arrays;

/**
 * @description: 浅克隆, 地址引用不变
 * @author:zhaojq
 */
public class Itest {
    public static void main(String[] args) {
        ConcretePrototypeA a = new ConcretePrototypeA();
        a.setAge(18);
        a.setName("111");
        a.setHobbies(Arrays.asList("1", "2"));

        //创建client,开始克隆
        Client client = new Client();
        ConcretePrototypeA a_clone = (ConcretePrototypeA) client.startClone(a);
        System.out.println(a_clone);

        System.out.println("克隆对象中的引用类型地址值：" + a_clone.getHobbies());
        System.out.println("原对象中的引用类型地址值：" + a.getHobbies());
        System.out.println("对象地址比较：" + (a_clone.getHobbies() == a.getHobbies()));
    }
}
