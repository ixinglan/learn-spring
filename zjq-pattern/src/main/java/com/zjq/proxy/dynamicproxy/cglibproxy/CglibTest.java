package com.zjq.proxy.dynamicproxy.cglibproxy;

import net.sf.cglib.core.DebuggingClassWriter;
/*
cglib比jdk效率高,是因为cglib采用了fastClass机制,原理:
    为代理类和被代理类各生成一个类,这个类会为代理类或被代理类的方法分配一个Index(int类型);
    这个index当作一个入参,fastClass就可以直接定位要调用的方法并直接进行调用,省去了反射调用;
    fastClass在第一次调用invoke()或invokeSuper()时生成,并放在了缓存中;
 */
public class CglibTest {
    public static void main(String[] args) {

        try {
            //JDK是采用读取接口的信息
            //CGLib覆盖父类方法
            //目的：都是生成一个新的类，去实现增强代码逻辑的功能

            //JDK Proxy 对于用户而言，必须要有一个接口实现，目标类相对来说复杂
            //CGLib 可以代理任意一个普通的类，没有任何要求

            //CGLib 生成代理逻辑更复杂，效率,调用效率更高，生成一个包含了所有的逻辑的FastClass，不再需要反射调用
            //JDK Proxy生成代理的逻辑简单，执行效率相对要低，每次都要反射动态调用

            //CGLib 有个坑，CGLib不能代理final的方法

            System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"proxy//cglib_proxy_classes");

            Customer obj = (Customer) new CGlibMeipo().getInstance(Customer.class);
            System.out.println(obj);
            obj.findLove();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
