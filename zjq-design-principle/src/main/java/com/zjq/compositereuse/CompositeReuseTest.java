package com.zjq.compositereuse;

/**
 * Created by zjq 合成复用原则
 */
public class CompositeReuseTest {

    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();
        productDao.setDbConnection(new OracleConnection());
        productDao.addProduct();
    }

}
