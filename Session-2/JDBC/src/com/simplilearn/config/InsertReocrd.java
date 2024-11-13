package com.simplilearn.config;

import java.sql.Connection;
import java.sql.Statement;

public class InsertReocrd {

	public static void main(String[] args) {
		Connection conn = DBConfigJDBC.getConnection();

		if (conn != null) {
			System.out.println("Connections Established");

			try {
				// 01 .Insert a Record
				Statement stmt=conn.createStatement();
				String query = "insert into eproduct(name,price)value('Nikunj-Laptop',120000)";
				// types of Statements:
				// 1--> Prepared Statements--> Dynamic Data
				// 2--> Callable Statements--> Stored procedure
				// 3---> Statements---> static Query
				int count=stmt.executeUpdate(query);
			System.out.println(count +" Record Updated");
				
				

			} catch (Exception e) {
				// TODO: handle exception
			}
		} else {
			System.out.println("Error in Connections");
		}

		// 01 insert record

	}

}
