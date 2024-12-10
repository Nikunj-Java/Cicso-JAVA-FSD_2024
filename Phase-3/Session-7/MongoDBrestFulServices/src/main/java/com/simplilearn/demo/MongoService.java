package com.simplilearn.demo;

import java.util.List;

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
	
	//method to get details
	public List<MyBook> getAllBooks(){
		return repo.findAll();
	}
	
	//get by id
	public MyBook getBookById(String Id) {
		if(repo.findById(Id).isPresent())
			return repo.findById(Id).get();
		else
			return null;
	}

}
