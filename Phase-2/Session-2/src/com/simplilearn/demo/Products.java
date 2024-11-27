package com.simplilearn.demo;

public class Products {
	
	String name;
	String brand;
	int price;
	
	public Products() {
		 
	}
	
	public Products(String name, String brand, int price) {
		 
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
	
	void showProduct() {
		System.out.println("-------------------------");
		System.out.println(name+"\t"+brand+"\t"+price);
		System.out.println("-------------------------");
		System.out.println();
	}

	@Override
	public String toString() {
		return "Products [name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}
	
	
	
	

}
