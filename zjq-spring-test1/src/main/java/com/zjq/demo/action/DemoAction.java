package com.zjq.demo.action;

import com.zjq.demo.service.IDemoService;
import com.zjq.mvcframework.annotation.QAutowired;
import com.zjq.mvcframework.annotation.QController;
import com.zjq.mvcframework.annotation.QRequestMapping;
import com.zjq.mvcframework.annotation.QRequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@QController
@QRequestMapping("/demo")
public class DemoAction {

  	@QAutowired
	private IDemoService demoService;

	@QRequestMapping("/query")
	public void query(HttpServletRequest req, HttpServletResponse resp,
					  @QRequestParam("name") String name){
		String result = demoService.get(name);
//		String result = "My name is " + name;
		try {
			resp.getWriter().write(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@QRequestMapping("/add")
	public void add(HttpServletRequest req, HttpServletResponse resp,
					@QRequestParam("a") Integer a, @QRequestParam("b") Integer b){
		try {
			resp.getWriter().write(a + "+" + b + "=" + (a + b));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@QRequestMapping("/remove")
	public void remove(HttpServletRequest req,HttpServletResponse resp,
					   @QRequestParam("id") Integer id){
	}

}
