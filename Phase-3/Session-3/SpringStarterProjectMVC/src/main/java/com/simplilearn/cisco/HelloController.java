package com.simplilearn.cisco;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HelloController {
	
	@GetMapping("/hello")
	public String hello() {
	
		return "Hello How Are You?";
	}
	
	@GetMapping("/test")
	public String test() {
	
		return "Hello test";
	}

	@GetMapping("/get")
	public String get() {
	
		return "Get Method";
	}
	
	 

}
