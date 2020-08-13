package com.zjq.proxy.dynamicproxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 *
 */
public class JDKMeipo implements InvocationHandler {

    //被代理的对象,把引用保存下来
    private Object target;

    public Object getInstance(Object person) throws Exception {
        this.target = person;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);//this, 由于实现了InvocationHandler,所以可以传this
    }

    //为什么走invoke方法
    //1 如果看生成的代理类字节码文件的放, 会发现代理类$Proxy0 extends Proxy,implements 接口,
    //2 代理对象会重写接口方法
    //3 Proxy 里有InvocationHandler h常量
    //4 代理对象方法里通过 this.h.invoke(this, method, null) 调用
    //5 而JDKMeipo是实现h的, 所以会走 invoke方法
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(this.target, args);
        after();
        return obj;
    }

    private void before() {
        System.out.println("我是媒婆，我要给你找对象，现在已经确认你的需求");
        System.out.println("开始物色");
    }

    private void after() {
        System.out.println("OK的话，准备办事");
    }
}
