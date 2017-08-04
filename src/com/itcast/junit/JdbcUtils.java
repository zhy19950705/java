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
   //配置文件只需要加载一次，提供静态代码，当前类被加载到内存执行
   static{
	   //使用JDK提供的工具类加载properties文件，提供getBundle()方法只需要填写文件即可
	   ResourceBundle bundle=ResourceBundle.getBundle("db");
	   //通过key获取需要的值
	   driver=bundle.getString("jdbc.driver");
	   url=bundle.getString("jdbc.url");
	   user=bundle.getString("jdbc.user");
	   password=bundle.getString("jdbc.password");
   }
   //获得连接
   public static Connection getConnection(){
	   try{
		   //注册驱动
		   Class.forName(driver);
		   //获得连接
		   Connection connection=DriverManager.getConnection(url);
		   return connection;
	   }catch (Exception e) {
		// TODO: handle exception
		   throw new RuntimeException(e);
	}
   }
  
}
