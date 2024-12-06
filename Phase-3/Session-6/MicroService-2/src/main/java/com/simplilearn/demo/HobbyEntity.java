package com.simplilearn.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class HobbyEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id",nullable = false,updatable = false)
	private int id;
	private int personId;
	private String Hobby;
	
	public HobbyEntity() {
		
	}

	public HobbyEntity(int id, int personId, String hobby) {
		//super();
		this.id = id;
		this.personId = personId;
		Hobby = hobby;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getHobby() {
		return Hobby;
	}

	public void setHobby(String hobby) {
		Hobby = hobby;
	}
	
	
	
	

}
