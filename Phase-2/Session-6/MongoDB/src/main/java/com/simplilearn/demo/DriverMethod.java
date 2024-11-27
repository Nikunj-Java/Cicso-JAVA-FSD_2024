package com.simplilearn.demo;

import java.util.Arrays;
import java.util.Scanner;

import org.bson.Document;

public class DriverMethod {

	public static void main(String[] args) {
		MongoCRUD crud=new MongoCRUD();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please Choose\n 1. CREATE\n 2.RETRIVE\n 3.UPDATE\n 4.DELETE\n 5.INSERT MANY\n 6. DELETE MANY");
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
			//update
			crud.update("Nikunj Soni", "Vishal");
			break;
		case 4:
			//delete
			crud.delete("Vishal");;
			break;
		case 5:
			//insert Many
			Document doc1= new Document("name","Jhon").append("age", 30);
			Document doc2= new Document("name","Jhoe").append("age", 27);
			Document doc3= new Document("name","Jhoden").append("age", 56);
			Document doc4= new Document("name","Jake").append("age", 45);
			
			crud.insertMany(Arrays.asList(doc1,doc2,doc3,doc4));
			
			break;
		case 6:
			//delete many
			crud.deletemany("name", "Jhon");
		
		 
	}

}

}
