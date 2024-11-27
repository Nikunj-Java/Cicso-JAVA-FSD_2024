package com.simplilearn.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateRecord {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Id to Update");
		int id=sc.nextInt();
		
		System.out.println("Enter Name to Update");
		String name=sc.next();
		
		 
		
		try {
			
			Connection conn=DBConfig.getConnection();
			PreparedStatement statement=conn.prepareStatement("update eproduct set name=? where id=?");
			statement.setString(1, name);
			statement.setInt(2, id);
			int i=statement.executeUpdate();
			System.out.println(i+"Record Updated Successfully");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
	}

}
