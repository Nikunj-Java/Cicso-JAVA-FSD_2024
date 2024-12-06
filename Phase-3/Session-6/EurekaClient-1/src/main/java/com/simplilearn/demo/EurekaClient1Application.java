package com.simplilearn.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EurekaClient1Application {

	//after starting an application
	//run: localhost:8080/hello
	//refresh: eureka server: localhost:8453
	//then you can see the client is connected to the server
	public static void main(String[] args) {
		SpringApplication.run(EurekaClient1Application.class, args);
	}

}
