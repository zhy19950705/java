package com.xml;

import java.io.File;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

public class testDom1j {
  @Test
	public void demo() throws Exception{
	   //1.ͨ��dom4j�ĺ��������xml���document
	  SAXReader saxReader=new SAXReader();
	  //����ִ��XML�ĵ�
	  Document document=saxReader.read(new File("src/com/xml/web_schema.xml"));
      //2.��ø�Ԫ��
	  Element rootElement=document.getRootElement();
	  //���ָ��������������ֵ
	  String version=rootElement.attributeValue("version");
	  System.out.println(version);
	  //3 ���������Ԫ��  element() ���ָ�����Ƶ�������Ԫ�ء����Բ�ָ������
	  List<Element> allChildElement=rootElement.elements();
	  //4.��������
	  for(Element childElement:allChildElement){
		  //5.1��ӡԪ����   getName()��õ�ǰԪ�ص�Ԫ����
		  String childEleName=childElement.getName();
		  System.out.println(childEleName);
		  //5.2����<servlet> ������ӱ�ǩ������
		  if("servlet".equals(childEleName)){
			  //��ʽ1�����Ԫ�ض���Ȼ�����ı�  element()���ָ�����Ƶ�һ����Ԫ��
			  Element servletNameElement=childElement.element("servlet-name");
			  //getText()��õ�ǰԪ�ص��ı�����
			  String servletName=servletNameElement.getText();
			  System.out.println("\t"+servletName);
			  //��ʽ2�����Ԫ���ı�ֵ elementText()���ָ��������Ԫ�ص��ı�ֵ
			  String servletClass=childElement.elementText("servlet-class");
			  System.out.println("\t"+servletClass);
		  }
	  }
   }
}
