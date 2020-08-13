package com.zjq.simpleresponsibility.method;

/**
 * Created by zjq
 */
public class Method {
    private void modifyUserInfo(String userName, String address) {
        userName = "zjq";
        address = "Changsha";
    }

    private void modifyUserInfo(String userName, String... fileds) {
        userName = "zjq";
//        address = "Changsha";
    }

    private void modifyUserInfo(String userName, String address, boolean bool) {
        if (bool) {

        } else {

        }

        userName = "zjq";
        address = "Changsha";
    }

    private void modifyUserName(String userName) {
        userName = "zjq";
    }

    private void modifyAddress(String address) {
        address = "Changsha";
    }


}
