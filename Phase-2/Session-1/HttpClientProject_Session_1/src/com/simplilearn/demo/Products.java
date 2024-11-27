package com.simplilearn.demo;

public class Products {
	
	String name;
	int price;
	double ratings;
	
	public Products() {

	}
	
	public Products(String name, int price, double ratings) {
		 
		this.name = name;
		this.price = price;
		this.ratings = ratings;
	}

	@Override
	public String toString() {
		return "Products [name=" + name + ", price=" + price + ", ratings=" + ratings + "]";
	}
	
	

}
