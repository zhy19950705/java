package com.servletmapping;

public class HelloMyServlet implements MyServlet{

	@Override
	public void init() {
		// TODO 自动生成的方法存根
		System.out.println("1.初始化");
	}

	@Override
	public void service() {
		// TODO 自动生成的方法存根
		System.out.println("2.执行中");
	}

	@Override
	public void destroy() {
		// TODO 自动生成的方法存根
		System.out.println("3.销毁");
	}

}
