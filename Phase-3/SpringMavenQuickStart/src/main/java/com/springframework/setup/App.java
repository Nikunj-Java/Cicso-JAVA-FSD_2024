package com.springframework.setup;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("bean.xml");
		
		HelloWorld h=(HelloWorld)context.getBean("obj");
		h.print();
		
	
	}

}
