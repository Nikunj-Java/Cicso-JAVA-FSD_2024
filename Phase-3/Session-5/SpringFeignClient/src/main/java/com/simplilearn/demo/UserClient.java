package com.simplilearn.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name= "userClient",url="https://jsonplaceholder.typicode.com/")
public interface UserClient {

	@GetMapping("/users/{id}")
	User getuserById(@PathVariable("id") Long id);

	class User{
		private long id;
		private String name;
		private String username;
		private String email;
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
	}
	
}
