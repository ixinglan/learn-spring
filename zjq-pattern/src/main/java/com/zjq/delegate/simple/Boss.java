package com.zjq.delegate.simple;

/**
 * @description:
 * @author:zhaojq
 */
public class Boss {
    public void command(String command, Leader leader){
        leader.doing(command);
    }
}
