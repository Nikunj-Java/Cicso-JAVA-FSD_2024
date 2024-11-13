package com.simplilearn.dao;

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
			
		 
		 
			
		}
	}

}
