package com.itcast.junit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

import org.junit.Test;

public class JdbcUtils {
   private static String driver;
   private static String url;
   private static String user;
   private static String password;
   //�����ļ�ֻ��Ҫ����һ�Σ��ṩ��̬���룬��ǰ�౻���ص��ڴ�ִ��
   static{
	   //ʹ��JDK�ṩ�Ĺ��������properties�ļ����ṩgetBundle()����ֻ��Ҫ��д�ļ�����
	   ResourceBundle bundle=ResourceBundle.getBundle("db");
	   //ͨ��key��ȡ��Ҫ��ֵ
	   driver=bundle.getString("jdbc.driver");
	   url=bundle.getString("jdbc.url");
	   user=bundle.getString("jdbc.user");
	   password=bundle.getString("jdbc.password");
   }
   //�������
   public static Connection getConnection(){
	   try{
		   //ע������
		   Class.forName(driver);
		   //�������
		   Connection connection=DriverManager.getConnection(url);
		   return connection;
	   }catch (Exception e) {
		// TODO: handle exception
		   throw new RuntimeException(e);
	}
   }
  
}
