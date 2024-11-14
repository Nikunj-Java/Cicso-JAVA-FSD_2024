package com.simplilearn.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConfig {
	public static Connection getConnection() {
		
		 String DRIVER="com.mysql.cj.jdbc.Driver"; 
		 String URL="jdbc:mysql://localhost:3306/cisco_user_2024"; 
		 String USERNAME="root"; 
		 String PASSWORD="Nikunj@123"; 
		
		Connection conn=null;
		
		try {
			
			Class.forName(Util.DRIVER);
			conn=DriverManager.getConnection(Util.URL,Util.USERNAME,Util.PASSWORD);
			
			 
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return conn;
	}

}
