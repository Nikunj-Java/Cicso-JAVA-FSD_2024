package com.simplilearn.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/bookdetails")
public class BookDetailsController {
	
	@Autowired
	private BookDetailsService service;
	
	@PostMapping("/")
	public BookDetailsEntity saveBook(@RequestBody BookDetailsEntity book) {
		return service.addBookDetails(book);
	}

}
