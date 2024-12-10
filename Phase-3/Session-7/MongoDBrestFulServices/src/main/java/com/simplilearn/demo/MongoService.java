package com.simplilearn.demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MongoService {
	
	@Autowired
	private MyBookRepository repo;
	
	RestTemplate restTemplate;
	
	
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
	
	//delete by id
	public boolean deleteBook(String id) {
		if(repo.findById(id).isPresent()) {
			repo.deleteById(id);
			return true;}
		else
			return false;	
	}

	
	//update user by Id
	
	public MyBook updateUser(MyBook book,String id) {
		
		if(repo.findById(id).isPresent()) {
			MyBook old=repo.findById(id).get();
			old.setTitle(book.getTitle());
			old.setYear(book.getYear());
			old.setAuthor(book.getAuthor());
			return repo.save(old);
		}else
			return null;
	}
	 
}
