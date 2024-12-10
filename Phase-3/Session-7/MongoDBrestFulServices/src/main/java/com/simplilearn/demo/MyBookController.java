package com.simplilearn.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping("/")
	public List<MyBook> getAllBooks(){
		return service.getAllBooks();
	}
	
	@GetMapping("/{id}")
	public  ResponseEntity<MyBook> getBookById(@PathVariable String id){
		MyBook book= service.getBookById(id);
		if(book!=null)
			return new ResponseEntity<MyBook>(book,HttpStatus.FOUND);
		else
			return new ResponseEntity<MyBook>(book, HttpStatus.NOT_FOUND);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deleteUser(@PathVariable String id){
		if(service.deleteBook(id))
			return new ResponseEntity<Object>("User Deleted Successfully",HttpStatus.OK);
		else
			return new ResponseEntity<Object>("No User Found with Given Id",HttpStatus.NOT_FOUND);
		
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Object> updateuser(@RequestBody MyBook book,@PathVariable String id){
		
		MyBook data=service.updateUser(book, id);
		if(data!=null)
			return new ResponseEntity<Object>(data,HttpStatus.OK);
		else
			return new ResponseEntity<Object>("User Not Found",HttpStatus.NOT_FOUND);
	}

}
