package com.simplilearn.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/books")
public class MyBookController {
	
	@Autowired
	private MongoService service;
	
	@PostMapping("/")
	public MyBook addBook(@RequestBody MyBook book) {
		return service.addBook(book);
	}

}
