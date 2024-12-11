package com.simplilearn.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AssertionExample {
	 
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before All Method Called");
	}

	 
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After All Method Called");
	}

	 
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before Each Method Called");
	}

	 
	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After Each Method Called");
	}

	@Test
	 void test() {
		 
		String s1= null;
		String s2= "Nikunj Soni";
		assertSame(s1, s2);
		 
	 }
	@Test
	 void test1() {
		 
		String s1= null;
		String s2= "Nikunj Soni";
		 
		assertNotSame(s1, s2);
		System.out.println("Test Case-1 Executed");
	 }
	@Test
	void test2() {
		String []a1= {"A","B"};
		String []a2= {"A","B"};
		assertArrayEquals(a1, a2);
		System.out.println("Test Case-2 Executed");
	}
	@Test
	 void test3() {
		 
		 	assertTrue(4>0);
		 	System.out.println("Test Case-3 Executed");
	 }
	
	@Test
	 void test4() {
		 
		 	assertFalse(4>5);
		 	System.out.println("Test Case-4 Executed");
	 }
	
	@Test
	 void test5() {
		
			String s3=null;
		 
		 	assertNull(s3);
		 	System.out.println("Test Case-5 Executed");
	 }
	@Test
	 void test6() {
		
			String s4="SimpliLearn";
		 
		 	assertNotNull(s4);
		 	System.out.println("Test Case-6 Executed");
	 }
	
	@Test
	 void test7() {
		
			 
		 
		 	assertThrows(RuntimeException.class, ()->{throw new RuntimeException();});
		 	System.out.println("Test Case-7 Executed");
	 }

}
