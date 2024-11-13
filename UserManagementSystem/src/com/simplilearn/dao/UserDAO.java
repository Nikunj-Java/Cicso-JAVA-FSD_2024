package com.simplilearn.dao;

import java.util.List;


public interface UserDAO {
	
	public int createUser(User user);
	
	public List<User> getAllUsers();
	
	public User updateUser(User user,int id);
	
	public boolean deleteUser(int id);
	
	public User getUserbyId(int id);
	

}
