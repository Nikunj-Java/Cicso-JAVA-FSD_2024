package com.simplilearn.config;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RetriveRecord {
	
	public static void main(String[] args) {
		Connection conn=DBConfigJDBC.getConnection();
		
		if(conn!=null) {
			try {
				
				PreparedStatement pst=conn.prepareStatement("select * from eproduct");
				ResultSet rs= pst.executeQuery();
				while(rs.next()) {
					System.out.println("---------------------------");
					System.out.println("Id: "+rs.getInt(1));//column Id
					System.out.println("Name: "+rs.getString(2));//column Name
					System.out.println("Price: "+rs.getDouble(3));//column Id
					System.out.println("Date_Added :"+rs.getDate(4));//column Date
				}
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			
		}else {
			System.out.println("Connection Error...!");
		}
	}

}
