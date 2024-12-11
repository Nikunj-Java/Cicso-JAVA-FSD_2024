package com.simplilearn.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SampleTestCases {
	
	@BeforeAll
	static void setUpBeforeAll() throws Exception{
		System.out.println("Before All Method Called");
	}

	@BeforeEach
	void setUpBeforetest() throws Exception {
		System.out.println("Before Test Case Method");
	}
	
	@Test
	void test1() {
		System.out.println("TestCase-1 Executed");
	}
	
	@Test
	void test2() {
		System.out.println("TestCase-2 Executed");
	}
	
	@AfterEach
	void setUpAftertest() throws Exception {
		System.out.println("After Test Case Method");
	}
	
	@AfterAll
	static void setUpAfterAll() throws Exception{
		System.out.println("After All Method Called");
	}

}
