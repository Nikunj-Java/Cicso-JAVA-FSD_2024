package com.simplilearn.demo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class StoredProcedureExample {
	
	public static void main(String[] args) {
		
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/cisco_user_2024";
		String username="root";
		String password="Nikunj@123";
		
		Connection conn=null;
		Scanner sc= new  Scanner(System.in);
		try {
			
			Class.forName(driver);
			conn=DriverManager.getConnection(url,username,password);
			
			System.out.println("***************STORED PROCEDURE*******************");
			 
			System.out.println("Enter Your Name");
			String uname=sc.nextLine();
			
			System.out.println("Enter Your Email");
			String uemail=sc.nextLine();
			
			System.out.println("Enter Your username");
			String uusername=sc.nextLine();
			
			
			CallableStatement stmt=conn.prepareCall("call add_user(?,?,?)");
			
			stmt.setString(1, uname);
			stmt.setString(2, uemail);
			stmt.setString(3, uusername);
			
			int x=stmt.executeUpdate();
			
			if(x>0) {
				System.out.println("Data Inserted Successfully");
			}else {
				System.out.println("Error While Inserting Data");
			}
			 
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
