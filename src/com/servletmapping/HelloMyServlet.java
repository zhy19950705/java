package com.servletmapping;

public class HelloMyServlet implements MyServlet{

	@Override
	public void init() {
		// TODO �Զ����ɵķ������
		System.out.println("1.��ʼ��");
	}

	@Override
	public void service() {
		// TODO �Զ����ɵķ������
		System.out.println("2.ִ����");
	}

	@Override
	public void destroy() {
		// TODO �Զ����ɵķ������
		System.out.println("3.����");
	}

}
