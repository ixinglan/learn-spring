package com.zjq.delegate.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author:zhaojq
 */
public class Leader implements IEmployee {
    private Map<String, IEmployee> targets = new HashMap<>();

    public Leader() {
        targets.put("登录", new EmployeeA());
        targets.put("加密", new EmployeeB());
    }

    @Override
    public void doing(String command) {
        targets.get(command).doing(command);
    }
}
