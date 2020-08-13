package com.zjq.singleton.register;

import java.io.*;

/**
 * @description:
 * @author:zhaojq
 */
public class Itest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        EnumSingleton e2 = EnumSingleton.getInstance();
        e2.setData(new Object());

        FileOutputStream fos = new FileOutputStream("EnumSingleton.obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(e2);
        oos.flush();
        oos.close();

        FileInputStream fis = new FileInputStream("EnumSingleton.obj");
        ObjectInputStream ois = new ObjectInputStream(fis);
        EnumSingleton e1 = (EnumSingleton) ois.readObject();
        ois.close();

        System.out.println(e1.getData());
        System.out.println(e2.getData());
        System.out.println(e1.getData() == e2.getData());
    }
}
