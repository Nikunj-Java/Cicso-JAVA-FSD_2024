package com.simplilearn.aspect;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		System.out.println("Welcome to AOP Demo");
		ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		Product product= context.getBean("pRef",Product.class);
		System.out.println(product);
		System.out.println();
		
		product.purchaseProduct("Home", "6 PM Evening", "nikunj@gmail.com");
		
		//ProxyFactoryBean
	}

}
