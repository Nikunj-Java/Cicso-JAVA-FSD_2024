package com.simplilearn.demo;

import java.util.Arrays;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LambdaJava11 {
	
	public static void main(String[] args) {
		
		//String text="Hello";
		var text="Hello";
		System.out.println(text);
		
		List<String> emails=Arrays.asList("abcd@gmail.com","nikunj@cisco.com");
		System.out.println(emails);
		
		String csvData=emails.stream().map(
				(var email)->email.replace("gmail.com", "cisco.com")
				).collect(Collectors.joining(","));
		
		System.out.println(csvData);
				
	}

}
