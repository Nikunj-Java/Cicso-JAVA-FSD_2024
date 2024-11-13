package com .simplilearn.demo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class BasicTransaction {
	
	public static void main(String[] args) throws SQLException{
		Connection conn=DBConfig.getConnection();
		try {
			conn.setAutoCommit(false);
			
			//execute statements
			Statement stmt=conn.createStatement();
			stmt.executeUpdate("update eproduct set price=56000 where id=11");
			stmt.executeUpdate("update eproduct set price=99000 where id=10");
			
			//if everything goes fine then
			conn.commit(); //transaction committed
			System.out.println("Transaction Completed Successfully");
			
		} catch (SQLException e) {
			// TODO: handle exception
			try {
				conn.rollback();
				//rollback the transaction
				
			} catch (SQLException e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			conn.setAutoCommit(true);
		}
	}

}
