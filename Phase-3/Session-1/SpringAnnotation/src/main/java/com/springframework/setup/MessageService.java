package com.springframework.setup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageService {
	
	private String appMessage;
	private int appVersion;
	
	@Autowired
	public MessageService(String appMessage,int appVersion) {
		this.appMessage=appMessage;
		this.appVersion=appVersion;
		
	}
	
	public void  displayMessage() {
		System.out.println(appMessage +" (Version : "+appVersion+" )");
	}
	

}
