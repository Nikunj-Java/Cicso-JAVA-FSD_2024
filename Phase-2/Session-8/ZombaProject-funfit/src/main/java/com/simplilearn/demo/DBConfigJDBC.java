package com.simplilearn.demo;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConfigJDBC {
	
	static  Connection getConnection() {
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/cisco_zumba"; //cisco2024 is my database name
		String username="root";
		String password="Nikunj@123";
		
		
		
		//02. getConnectivity
		Connection conn=null;
		
		try {
			
			//01. load the Driver
			Class.forName(driver);
			conn=DriverManager.getConnection(url,username,password);
			
			//03. check the connections
			
			if(conn!=null) {
				return conn;
			}
			else {
				return null;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return conn;
	}
	

}