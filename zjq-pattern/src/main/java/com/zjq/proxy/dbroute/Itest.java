package com.zjq.proxy.dbroute;

import com.zjq.proxy.dbroute.proxy.OrderServiceDynamicProxy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description:
 * @author:zhaojq
 */
public class Itest {
    public static void main(String[] args) throws ParseException {
        Order order = new Order();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date date = sdf.parse("2017/07/01");
        order.setCreateTime(date.getTime());

//        IOrderService orderService = new OrderServiceStaticProxy(new OrderService());
//        orderService.createOrder(order);

        //动态代理实现
        IOrderService orderService1 = (IOrderService) new OrderServiceDynamicProxy().getInstance(new OrderService());
        orderService1.createOrder(order);
    }
}
