package com.simplilearn.demo;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConfig {
	
	
	public static void main(String[] args) {
		
		//goto> https://downloads.mysql.com/archives/c-j/
		//download the driver
		//right click to your project>Buildpath>Configure Build Path> click on Libraries >classpath>
		//on right hand side you will see Button To add External Jar File  
		// add Your MySQL Connector > click Apply and Save 
		//then only Write the Below Code
		
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/cisco2024"; //cisco2024 is my database name
		String username="root";
		String password="Nikunj@123";
		
		
		try {
			
			//01. load the Driver
			Class.forName(driver);
			
			//02. getConnectivity
			Connection conn=DriverManager.getConnection(url,username,password);
			
			//03. check the connections
			
			if(conn!=null) {
				System.out.println("Connections Established");
			}
			else {
				System.out.println("Error While Connection...!");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
	}

}
