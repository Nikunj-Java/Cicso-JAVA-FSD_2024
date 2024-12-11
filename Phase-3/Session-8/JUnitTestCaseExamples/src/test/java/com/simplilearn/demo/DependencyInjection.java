package com.simplilearn.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

@DisplayName("DI Example")
class DependencyInjection {
	
	
	public DependencyInjection(TestInfo info) {
		Assertions.assertEquals("DI Example", info.getDisplayName());
	}
	
	@Test
	@DisplayName("Another Test")
	public void myTest(TestInfo info) {
	Assertions.assertEquals("Another Test", info.getDisplayName());
	}
	
	@Test
	@DisplayName("My-Test")
	@Tag("my-test")
	public void myTest1(TestInfo info) {
		Assertions.assertEquals("My-Test", info.getDisplayName());
		Assertions.assertTrue(info.getTags().contains("my-test"));
	}
	 

}
