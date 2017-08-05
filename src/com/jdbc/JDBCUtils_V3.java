package com.jdbc;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;


public class JDBCUtils_V3 {
		private static String driver;
		private static String url;
		private static String username;
		private static String password;
		// 配置文件只需要加载一次，提供静态代码，当前类被加载到内存执行
		static {
			try {
				//1.通过当前类获得类加载器
				ClassLoader classLoader = JDBCUtils_V3.class.getClassLoader();
				//2.通过类加载器方法获得一个输入流
				InputStream is = classLoader.getResourceAsStream("db.properties");
				//3.创建一个properties对象
				Properties props = new Properties();
			    //4.加载输入流
				props.load(is);
			    //获取相关参数值
				driver = props.getProperty("driver");
				url = props.getProperty("url");
				username = props.getProperty("username");
				password = props.getProperty("password");
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		// 获得连接
		public static Connection getConnection() {
			try {
				// 注册驱动
				Class.forName(driver);
				// 获得连接
				Connection connection = DriverManager.getConnection(url);
				return connection;
			} catch (Exception e) {
				// TODO: handle exception
				throw new RuntimeException(e);
			}
		}

		public static void release(Connection conn, PreparedStatement pstmt, ResultSet rs) {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}
