package com.simplilearn.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MongoService {
	
	@Autowired
	private MyBookRepository repo;
	
	
	//method to add book
	public MyBook addBook(MyBook book) {
		return repo.save(book);
	}

}
