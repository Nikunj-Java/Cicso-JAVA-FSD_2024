package com.springframework.setup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
	
	private MessageService messageService;
	
	@Autowired
	public HelloWorld(MessageService messageService) {
		this.messageService=messageService;
	}
	
	public void printMessage() {
		//System.out.println("Hello!, Spring Annotations!");
		messageService.displayMessage();
	}

}
