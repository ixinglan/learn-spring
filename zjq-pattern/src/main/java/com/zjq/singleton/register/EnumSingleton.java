package com.zjq.singleton.register;

/**
 * @description: 注册式: 枚举  单例
 * 反序列化不能破坏单例: readObject 当是枚举类型是,通过类名和对象类判断唯一
 * 反射不能破坏单例: newInstance 方法中,如果是枚举类型,则直接抛异常
 * @author:zhaojq
 */
public enum EnumSingleton {
    INSTANCE;
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
