package com.simplilearn.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConfig {
	
	public static Connection getConnection() {
		
		  String Driver="com.mysql.cj.jdbc.Driver";
	      String URL="jdbc:mysql://localhost:3306/cisco2024";
	      String username="root";
	      String password="Nikunj@123";
		Connection conn=null;
		try {
			
			Class.forName(Driver);
			conn=DriverManager.getConnection(URL,username,password);
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
