package com.simplilearn.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/person")
public class PersonController {

	@Autowired
	private PersonService service;
	
	@PostMapping("/")
	public ResponseEntity<PersonEntity> addPerson(@RequestBody PersonEntity person){
		PersonEntity obj=service.addPerson(person);
		return new ResponseEntity<PersonEntity>(obj,HttpStatus.CREATED);
	}
	
	@GetMapping("/{personId}")
	public PersonResponse  getPerson(@PathVariable int personId) {
		return service.getPerson(personId);
	}
}
