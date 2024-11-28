package com.simplilearn.aspect;

public class Product {

	int id;
	String name;
	int price;
	String brand;
	int stock;
	String userEmail;
	
	boolean canBuy;

	public boolean isCanBuy() {
		return canBuy;
	}

	public void setCanBuy(boolean canBuy) {
		this.canBuy = canBuy;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public Product() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	 

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", brand=" + brand + ", stock=" + stock
				+ ", userEmail=" + userEmail + "]";
	}

	public void purchaseProduct(String dlocation, String dtime, String userCall) {

		if(canBuy) {
			System.out.println("---------------------");
			System.out.println("[Product] bank transfer Strated for "+name +"with price as "+price);
			System.out.println("[Product] Thankyou "+userCall+"  for buying "+name+ " of "+brand);
		}else {
			System.out.println("[Product] we are out of stock, please come back later");
		}
		 
	}

}
