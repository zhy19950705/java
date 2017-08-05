package com.servletmapping;

import org.junit.Test;

public class TestServlet {
	//Ӳ����
	@Test
	public void demo() {
        MyServlet myServlet=new HelloMyServlet();
        myServlet.init();
        myServlet.service();
        myServlet.destroy();
	}
	@Test
	public void demo2() throws Exception{
		/*���䴴��ִ��
		1 Class.forName���ָ���ӿڻ����Class����
		2 newInsetance() ͨ��Class���󴴽���Ķ���ʵ�����൱��new Xxx();
		*/
		String servletClass="com.servlet.HelloMyServlet";
		//3 ����ַ���ʵ����ʵ��
		Class clazz=Class.forName(servletClass);
		MyServlet myServlet=(MyServlet) clazz.newInstance();
		//4 ִ�ж���ķ���
		myServlet.init();
		myServlet.service();
		myServlet.destroy();
	}
}
