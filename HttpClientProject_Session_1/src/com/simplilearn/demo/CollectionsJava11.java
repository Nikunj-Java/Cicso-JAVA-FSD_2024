package com.simplilearn.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class CollectionsJava11 {
	
	public static void main(String[] args) {
		
		//Example:1 
		ArrayList<String> emails=new  ArrayList<String>();
		emails.add("nikunj@gmail.com");
		emails.add("shbhapka@cisco.com");
		emails.add("aishimpi@cisco.com");
		
		//System.out.println(emails);
		
		String[] emailsArray= {"nikunj@gmail.com","shbhapka@cisco.com","aishimpi@cisco.com"} ;
		List<String> emailsList=Arrays.asList(emailsArray);
		
		System.out.println(emailsList);
		
		//String[] myEmails= emailsList.toArray(Object[]::new);
		
		
		//Example:2
		
		List<String>names =List.of("Nikunj","jhon","Sandeep");
		
		String[] namesArray=names.toArray(String[]::new);
		
		System.out.println("Converting List to Array:"+Arrays.toString(namesArray));
		
		//Example:3 
		Map<Integer, String>map= Map.of(1,"One",2,"Two",3,"Three");
		
		Integer[] keysArray=map.keySet().toArray(Integer[]::new);
		System.out.println("Convert Keys to an Array:"+Arrays.toString(keysArray));
	}

}
