package com.simplilearn.dao;

import java.util.List;
import java.util.Scanner;

public class UserManagementSystem {
	
	public static void main(String[] args) {
		UserDAO dao=new UserDaoImpl();
		Scanner sc= new Scanner(System.in);
		System.out.println("PRESS 1 FOR CREATE RECORD \n PRESS 2 FOR UPDATE RECORD \n PRESS 3 FOR DELETE RECIRD \n PRESS 4 FOR RETRIVE RECORD \n PRESS 5 FOR RETRIVE RECORD BY ID");
		int input=sc.nextInt();
		
		switch (input) {
		case 1:  
			//create Record
			System.out.println("***************INSERT-RECORD*****************");
			sc.nextLine();
			System.out.println("Enter your NAME");
			
			String name=sc.nextLine();
			System.out.println("Enter Your EMAIL");
			String email=sc.nextLine();
			
			System.out.println("Enter Your USERNAME");
			String username=sc.nextLine();
			
			int res=dao.createUser(new User(name, email, username));
			if(res>0) {
				System.out.println("User Inserted Successfully");
			}else {
				System.out.println("User Not Inserted");
				
			}
			break;
			
		case 4:
			//Retrive a Record
			System.out.println("***************RETRIVE-RECORD*****************");
			List<User> list=dao.getAllUsers();
			System.out.println(list);
			break;
			
		case 5:
			//Retrive a Record
			System.out.println("***************RETRIVE-RECORD*****************");
			System.out.println("Enter Id to search for User");
			int Search_id=sc.nextInt();
			
			//call userDao Method
			
			User u=dao.getUserbyId(Search_id);
			System.out.println(u.toString());
			break;
			
		 
		 
			
		}
	}

}
