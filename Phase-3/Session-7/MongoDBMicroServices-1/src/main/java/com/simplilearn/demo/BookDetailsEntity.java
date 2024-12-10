package com.simplilearn.demo;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "myBookDetails")
public class BookDetailsEntity {
	
	private String id;
	private String bookId;
	private double price;
	
	public BookDetailsEntity() {
		// TODO Auto-generated constructor stub
	}

	public BookDetailsEntity(String id, String bookId, double price) {
		//super();
		this.id = id;
		this.bookId = bookId;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "BookDetailsEntity [id=" + id + ", bookId=" + bookId + ", price=" + price + "]";
	}
	
	

}
