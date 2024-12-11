package com.simplilearn.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	Calculator cal;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	
		System.out.println("Calculator Started......");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Calculator Stopped......");
		 
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Initializing Calculator......");
		cal= new Calculator();
		
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Stopping Calulator");
		cal=null;
	}

	@Test
	void addTest() {
		 assertEquals(5, cal.add(3, 2)); 
		 System.out.println("checking Addition Test Case");
		 
	}
	
	@Test
	void subTest() {
		 assertNotEquals(20, cal.sub(20, 2)); 
		 System.out.println("checking Subtraction Test Case");
	}
	
	
	//create multiply testcase
	
	//create sub testcase

}
