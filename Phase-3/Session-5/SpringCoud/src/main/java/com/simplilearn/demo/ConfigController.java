package com.simplilearn.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
	
	@Value("${my.property:Default Value}")
	private String myProperty;
	
	@GetMapping("/property")
	public String getProperty() {
		return myProperty;
	}

	
}
