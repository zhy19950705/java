package com.servletmapping;

public interface MyServlet {
   //1.初始化
	public void init();
   //2.执行
	public void service();
	//3.销毁
	public void destroy();
}
