package com.develop.web;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class MySQLConnectionTest {

	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL    = "jdbc:mysql://192.168.0.131:3306/mydb00?useUnicode=true&amp;characterEncoding=UTF-8";
	private static final String USER   = "xman";
	private static final String PW     = "tuca7996";
	
	@Test
	public void testConnection() throws	Exception {
		
		Class.forName(DRIVER); // Class.forName("com.mysql.jdbc.Driver");
		
		try(Connection con = DriverManager.getConnection(URL,USER,PW)){
			
			System.out.println(con);
			
		}catch(Exception e) {
			e.printStackTrace();			
		}
		
	}
	
}
