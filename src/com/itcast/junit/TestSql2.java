package com.itcast.junit;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

public class TestSql2 {
	@Test
	   public void demo1() throws SQLException{
		   Connection connection=null;
		   PreparedStatement st=null;
		   ResultSet rs=null;
		   try{
			   connection=JdbcUtils.getConnection();
			   System.out.println("success");
		   }catch (Exception e) {
			// TODO: handle exception
			   e.printStackTrace();
		}finally{
			connection.close();
		}
		   
	   }
}
