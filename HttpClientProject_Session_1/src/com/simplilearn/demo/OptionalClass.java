package com.simplilearn.demo;

import java.util.Optional;

class UserDetails{
	String name;
	String phone;
	String email;
	UserDetails(){
		
	}
	public UserDetails(String name, String phone, String email) {
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", phone=" + phone + ", email=" + email + "]";
	}
}

public class OptionalClass {
	
	public static void main(String[] args) {
		UserDetails u1= new UserDetails();
		UserDetails u2= new UserDetails("Nikunj Soni", "9988776655", "nikunj@cisco.com");
		UserDetails u3=null;
		
		System.out.println("Name in u1 is: "+u1.name);
		System.out.println("Name in u2 is: "+u2.name.toUpperCase());
		//System.out.println("Name in u1 is: "+u3.name);
		
		Optional<String>checkfornames=Optional.ofNullable(u1.name);
		if(checkfornames.isPresent()) {
			System.out.println("Name in u1 is : "+u1.name.toUpperCase());
		}else {
			System.out.println("Sorry , Name in u1 is null");
		}
		
		Optional<String>checkfornames1=Optional.ofNullable(u2.name);
		if(checkfornames1.isPresent()) {
			System.out.println("Name in u2 is : "+u2.name.toUpperCase());
		}else {
			System.out.println("Sorry , Name in u2 is null");
		}
		
		Optional<UserDetails>checkfornames2=Optional.ofNullable(u3);
		if(checkfornames2.isPresent()) {
			System.out.println("Name is : "+u3.name.toUpperCase());
		}else {
			System.out.println("Sorry , Name in u3 is null");
		}
	}
}
