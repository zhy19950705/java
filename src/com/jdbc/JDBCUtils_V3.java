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
		// �����ļ�ֻ��Ҫ����һ�Σ��ṩ��̬���룬��ǰ�౻���ص��ڴ�ִ��
		static {
			try {
				//1.ͨ����ǰ�����������
				ClassLoader classLoader = JDBCUtils_V3.class.getClassLoader();
				//2.ͨ����������������һ��������
				InputStream is = classLoader.getResourceAsStream("db.properties");
				//3.����һ��properties����
				Properties props = new Properties();
			    //4.����������
				props.load(is);
			    //��ȡ��ز���ֵ
				driver = props.getProperty("driver");
				url = props.getProperty("url");
				username = props.getProperty("username");
				password = props.getProperty("password");
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		// �������
		public static Connection getConnection() {
			try {
				// ע������
				Class.forName(driver);
				// �������
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
