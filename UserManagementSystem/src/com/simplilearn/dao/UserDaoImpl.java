package com.simplilearn.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import com.simplilearn.dao.UserDAO;


public class UserDaoImpl implements UserDAO {

	@Override
	public int createUser(User user) {
		// TODO Auto-generated method stub
		
		int result=0;
		 
		Connection conn=DBConfig.getConnection();
		
		if(conn!=null) {
			try {
				
				String query="insert into user(name,email,username) value(?,?,?)";
				PreparedStatement stmt= conn.prepareStatement(query);
				
				stmt.setString(1, user.getName());
				stmt.setString(2, user.getEmail());
				stmt.setString(3, user.getUsername());
				
				result=stmt.executeUpdate();
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Error: "+e);
			} finally {
				try {
					conn.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		}else {
			System.out.println("Error While Connecting to Database");
		}
		
		return result;
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateUser(User user, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteUser(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User getUserbyId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
