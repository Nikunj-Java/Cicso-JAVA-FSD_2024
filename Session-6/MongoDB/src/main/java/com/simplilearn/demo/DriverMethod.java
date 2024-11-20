package com.simplilearn.demo;

import java.util.Scanner;

public class DriverMethod {
	
	public static void main(String[] args) {
		MongoCRUD crud=new MongoCRUD();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please Choose\n 1. CREATE\n 2.RETRIVE\n 3.UPDATE\n 4.DELETE\n");
		sc.nextLine();
		
		int key= sc.nextInt();
		
		//create Dynamic Insertion with user input
		
		switch (key) {
		case 1:
			//create
			crud.create("Alex", 18);
			break;
		case 2:
			//read
			crud.read("jhon");
			break;
		case 3:
			//read
			crud.update("Nikunj Soni", "Vishal");;
			break;
		case 4:
			//read
			crud.delete("Vishal");;
			break;
		}
		
		 
		
		
	}

}
