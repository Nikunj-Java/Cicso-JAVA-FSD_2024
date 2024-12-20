package com.simplilearn.cisco;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MainController {
	
	@GetMapping("/user")
	public String getUser() {
		RestTemplate restTemplate=new RestTemplate();
		UserEntity user= restTemplate.getForObject("https://jsonplaceholder.typicode.com/users/1", UserEntity.class);
		
		return user.toString();
	}
	
	@GetMapping("/user/{id}")
	public String getUserById(@PathVariable int id) {
		RestTemplate restTemplate=new RestTemplate();
		UserEntity user= restTemplate.getForObject("https://jsonplaceholder.typicode.com/users/"+id, UserEntity.class);
		
		return user.toString();
	}
	
	@PostMapping("/user")
	public UserEntity createUser(@RequestBody UserEntity u) {
		return new UserEntity(u.getName(), u.getUsername(), u.getEmail(), u.getPhone(), u.getWebsite());
	}
	
	@PutMapping("/user/{id}")
	public UserEntity UpdateUser(@PathVariable int id,@RequestBody UserEntity u) {	
		return new UserEntity(u.getName(), u.getUsername(), u.getEmail(), u.getPhone(), u.getWebsite());
	}
	
	//delete mapping
	
	 

}
