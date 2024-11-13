package com.simplilearn.demo;

import java.sql.Connection;
import java.sql.Statement;

public class StaticBatchProcess {
	
	public static void main(String[] args) {
		
		Connection conn=DBConfig.getConnection();
		
		try {
			Statement stmt=conn.createStatement();
			stmt.addBatch("insert into eproduct (name,price) value ('ACBCD-LAPTOP',24000)");
			stmt.addBatch("insert into eproduct (name,price) value ('Lenovo thinkpad',86000)");
			stmt.addBatch("insert into eproduct (name,price) value ('Acer i7',124000)");
			stmt.addBatch("insert into eproduct (name,price) value ('Lenovo Mini',46000)");
			stmt.addBatch("insert into eproduct (name,price) value ('Lenovo Desktop',87000)");
			stmt.addBatch("insert into eproduct (name,price) value ('VIO Laptop',30000)");
			
			int arr[]=stmt.executeBatch();
			System.out.println(arr.length+ " Records Inserted");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
