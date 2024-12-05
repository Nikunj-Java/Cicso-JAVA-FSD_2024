package com.simplilearn.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	private final UserClient userClient;
	
	public UserController(UserClient userClient) {
		this.userClient=userClient;
	}
	
	@GetMapping("/users/{id}")
	public UserClient.User getUser(@PathVariable  Long id){
		return userClient.getuserById(id);
	}

}
