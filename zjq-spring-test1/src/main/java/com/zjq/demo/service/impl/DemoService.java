package com.zjq.demo.service.impl;


import com.zjq.demo.service.IDemoService;
import com.zjq.mvcframework.annotation.QService;

/**
 * 核心业务逻辑
 */
@QService
public class DemoService implements IDemoService {

	public String get(String name) {
		return "My name is " + name;
	}

}
