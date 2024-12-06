package com.simplilearn.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HobbyService {

	@Autowired
	private HobbyRepo repo;
	
	
	public HobbyEntity addHobby(HobbyEntity hobby) {
		return repo.save(hobby);
	}
}
