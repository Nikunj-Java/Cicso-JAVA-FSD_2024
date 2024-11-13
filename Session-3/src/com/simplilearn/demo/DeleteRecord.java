package com.simplilearn.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteRecord {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ID to Delete record");
		int id=sc.nextInt();
		
		try {
			Connection conn=DBConfig.getConnection();
			PreparedStatement pst=conn.prepareStatement("delete from eproduct where id=?");
			pst.setInt(1, id);
			
			int i=pst.executeUpdate();
			System.out.println(i+ " Record Deleted Successfully");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
