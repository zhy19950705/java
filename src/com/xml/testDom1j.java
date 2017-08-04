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
	   //1.通过dom4j的核心类加载xml获得document
	  SAXReader saxReader=new SAXReader();
	  //加载执行XML文档
	  Document document=saxReader.read(new File("src/com/xml/web_schema.xml"));
      //2.获得根元素
	  Element rootElement=document.getRootElement();
	  //获得指定属性名的属性值
	  String version=rootElement.attributeValue("version");
	  System.out.println(version);
	  //3 获得所有子元素  element() 获得指定名称的所有子元素。可以不指定名称
	  List<Element> allChildElement=rootElement.elements();
	  //4.遍历所有
	  for(Element childElement:allChildElement){
		  //5.1打印元素名   getName()获得当前元素的元素名
		  String childEleName=childElement.getName();
		  System.out.println(childEleName);
		  //5.2处理<servlet> 并获得子标签的内容
		  if("servlet".equals(childEleName)){
			  //方式1：获得元素对象然后获得文本  element()获得指定名称第一个子元素
			  Element servletNameElement=childElement.element("servlet-name");
			  //getText()获得当前元素的文本内容
			  String servletName=servletNameElement.getText();
			  System.out.println("\t"+servletName);
			  //方式2：获得元素文本值 elementText()获得指定名称子元素的文本值
			  String servletClass=childElement.elementText("servlet-class");
			  System.out.println("\t"+servletClass);
		  }
	  }
   }
}
