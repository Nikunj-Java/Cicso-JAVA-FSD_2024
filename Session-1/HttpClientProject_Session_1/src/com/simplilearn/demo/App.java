package com.simplilearn.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class App {
	
	public static void main(String[] args) {
		Estore estore= new Estore();
		ArrayList<Products> products=estore.getProductsFromStore();
		
		System.out.println("Estore Products:");
		products.forEach((product)-> System.out.println(product));
		
		Comparator<Products>comparator1 =new Comparator<Products>() {
			
			@Override
			public int compare(Products o1, Products o2) {
				// TODO Auto-generated method stub
				return o1.name.compareTo(o2.name);
			}
		};
		
		Collections.sort(products,comparator1);
		
		System.out.println("EStore Products  After Sort");
		System.out.println("----------------------------");
		products.forEach((product)-> System.out.println(product));
	}
	
	//sort the data by using price and Ratings......

}
