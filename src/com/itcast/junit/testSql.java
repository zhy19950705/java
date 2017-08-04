package com.itcast.junit;

import java.sql.*;

public class testSql {
	public static void main(String[] args) throws SQLException {
		Connection con = null;
		//预处理
		PreparedStatement statement = null;
		ResultSet res = null;
		try {
			//动态导入数据库驱动
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName=day05_db", "sa", "Sa123456");
			//插入数据
//			String sql = "insert into mytest([name],[sex],address,age,date) values('小锋锋','男','杭州',22,getdate())";
//			statement = con.prepareStatement(sql);
//			statement.executeUpdate();
//			System.out.println("插入成功！");
			//修改数据
//			String sql="update mytest set sex='女' where name='小锋锋'" ;
//			statement=con.prepareStatement(sql);
//			statement.executeUpdate();
//			System.out.println("修改成功！");
			//删除数据
//			String sql="delete from mytest where name='yi'";
//			statement=con.prepareStatement(sql);
//			statement.executeUpdate();
//			System.out.println("删除成功！");
			//查询数据
           String sql="select *from mytest where id=8";           
           statement=con.prepareStatement(sql);
			res = statement.executeQuery();						
			while (res.next()) {
				System.out.println(res.getString("name"));
			}
		} catch (Exception e) {
			e.printStackTrace();
			//先得到的后关闭
			res.close();
			statement.close();
			con.close();
		} 
	}

}
