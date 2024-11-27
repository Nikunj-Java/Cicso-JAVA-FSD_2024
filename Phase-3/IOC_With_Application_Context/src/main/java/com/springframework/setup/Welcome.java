package com.springframework.setup;

public class Welcome {
	
	private String message; 
	
	public void setMessage(String message) {
		this.message=message;
	}
	
	public void getMessage() {
		System.out.println("Your Message: "+message);
	}

}
