package com.simplilearn.demo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class StreamsInJava {
	
	public static void main(String[] args) {
		
		Stream<String> stream= Stream.empty();
		
		ArrayList<String> emails=new ArrayList<String>();
		emails.add("nikunj@gmail.com");
		emails.add("jhon@gmail.com");
		emails.add("abc@cisco.com");
		emails.add("george@cisco.com");
		
		Stream<String> stream2=emails.stream();
		Stream<String> stream3=Arrays.asList("nikunj@gmail.com","jenny@cisco.com","peter@cisco.com").stream();
		String [] emailsArray=new String[] {"jhon@gmail.com","peter@cisco.com","fionna@cissco.com"};
		
		Stream<String> stream4=Arrays.stream(emailsArray);
		
		Stream<String> stream5=Stream.of("nikunj@gmail.com","jenny@cisco.com","peter@cisco.com");
		
		Builder<String> builder=Stream.builder();
		builder.add("nikunj@cisco.com");
		builder.add("jenny@cisco.com");
		
		Stream<String> stream6=builder.build();
		
		
		stream2.forEach((element)->System.out.println(element));
		stream3.forEach((element)->System.out.println(element));
		
		
	
		
	}

}
