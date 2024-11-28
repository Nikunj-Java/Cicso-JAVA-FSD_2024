package com.springframework.setup;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springframework.setup")
public class AppConfig {
	
	@Bean
	public String appMessage() {
		return "Hello World From AppConnfig!";
	}
	
	@Bean
	public int appVersion() {
		return 1;
	}

}
