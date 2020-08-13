package com.zjq.proxy.staticproxy;

/**
 * @description:
 * @author:zhaojq
 */
public class Father {
    private Son son;

    public Father(Son son) {
        this.son = son;
    }

    //获取目标对象的引用
    public void findLove() {
        System.out.println("父亲帮忙介绍");
        this.son.findLove();
        System.out.println("双方同意交往,确立关系");
    }
}
