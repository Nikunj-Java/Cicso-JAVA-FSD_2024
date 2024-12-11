package com.simplilearn.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class NestedTestCaseExample {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before All");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After All");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before Each");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After Each");
	}

	@Test
	void test() {
		System.out.println("Main test Case");
	}
	
	@Nested
	//@Disabled //test case will not be executed
	class inner {
		@BeforeEach
		void setUp() throws Exception {
			System.out.println("Before Each");
		}
		@Test
		void test() {
			System.out.println("Nested Test Case");
		}
		@AfterEach
		void tearDown() throws Exception {
			System.out.println("After Each");
		}
		@Nested
		class inner1{
			@BeforeEach
			void setUp() throws Exception {
				System.out.println("Before Each");
			}
			@Test
			void test() {
				System.out.println("Nested-Nested Test Case");
			}
			@AfterEach
			void tearDown() throws Exception {
				System.out.println("After Each");
			}
			
		}
	}

}
