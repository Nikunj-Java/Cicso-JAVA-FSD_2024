package com.simplilearn.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookDetailsService {
	
	@Autowired
	private MyBookDetailsRepo repo;

	//save the basic details
	public BookDetailsEntity addBookDetails(BookDetailsEntity book) {
		return repo.save(book);
	}
	
	public String findByBookId(String bookId) {
		return repo.findBookById(bookId);
	}
	 
}
