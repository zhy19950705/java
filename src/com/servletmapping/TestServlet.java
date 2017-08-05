package com.servletmapping;

import org.junit.Test;

public class TestServlet {
	//硬编码
	@Test
	public void demo() {
        MyServlet myServlet=new HelloMyServlet();
        myServlet.init();
        myServlet.service();
        myServlet.destroy();
	}
	@Test
	public void demo2() throws Exception{
		/*反射创建执行
		1 Class.forName获得指定接口或类的Class对象
		2 newInsetance() 通过Class对象创建类的对象实例，相当于new Xxx();
		*/
		String servletClass="com.servlet.HelloMyServlet";
		//3 获得字符串实现类实例
		Class clazz=Class.forName(servletClass);
		MyServlet myServlet=(MyServlet) clazz.newInstance();
		//4 执行对象的方法
		myServlet.init();
		myServlet.service();
		myServlet.destroy();
	}
}
