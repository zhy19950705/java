package com.itcast.junit;

import java.sql.*;

public class testSql {
	public static void main(String[] args) throws SQLException {
		Connection con = null;
		//Ԥ����
		PreparedStatement statement = null;
		ResultSet res = null;
		try {
			//��̬�������ݿ�����
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName=day05_db", "sa", "Sa123456");
			//��������
//			String sql = "insert into mytest([name],[sex],address,age,date) values('С���','��','����',22,getdate())";
//			statement = con.prepareStatement(sql);
//			statement.executeUpdate();
//			System.out.println("����ɹ���");
			//�޸�����
//			String sql="update mytest set sex='Ů' where name='С���'" ;
//			statement=con.prepareStatement(sql);
//			statement.executeUpdate();
//			System.out.println("�޸ĳɹ���");
			//ɾ������
//			String sql="delete from mytest where name='yi'";
//			statement=con.prepareStatement(sql);
//			statement.executeUpdate();
//			System.out.println("ɾ���ɹ���");
			//��ѯ����
           String sql="select *from mytest where id=8";           
           statement=con.prepareStatement(sql);
			res = statement.executeQuery();						
			while (res.next()) {
				System.out.println(res.getString("name"));
			}
		} catch (Exception e) {
			e.printStackTrace();
			//�ȵõ��ĺ�ر�
			res.close();
			statement.close();
			con.close();
		} 
	}

}
