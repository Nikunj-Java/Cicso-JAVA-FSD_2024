package com.simplilearn.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
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
		Connection conn=DBConfig.getConnection();
		String query="Select * from user";
		try {
			PreparedStatement pst=conn.prepareStatement(query);
			ResultSet rst=pst.executeQuery();
			List<User> list=new ArrayList<>();
			
			while(rst.next()) {
				User u= new User(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4));
				list.add(u);
			}
			return list;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		} finally {
			try {
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		
	}
     //complete within 10 min
	@Override
	public User updateUser(User user, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	//complete within 10 min
	@Override
	public boolean deleteUser(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User getUserbyId(int id) {
		// TODO Auto-generated method stub
		User user=null;
		ResultSet result=null;
		Connection conn=DBConfig.getConnection();
		if(conn!=null) {
			try {
				String query="select * from user where id=?";
				PreparedStatement pst=conn.prepareStatement(query);
				pst.setInt(1, id);
				result=pst.executeQuery();
				result.next();
				
				user=new User(result.getInt("id"), result.getString("name"), result.getString("email"), result.getString("username"));
				
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
			System.out.println("Error While Connecting to DATABASE");
		}
		return user;
	}

}
