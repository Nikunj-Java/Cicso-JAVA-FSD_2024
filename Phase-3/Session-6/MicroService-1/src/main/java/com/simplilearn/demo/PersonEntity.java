package com.simplilearn.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PersonEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int  personId;
	private String name;
	private String email;
	private String password;
	private int age;
	
	
	public PersonEntity() {
		
	}


	public int getPersonId() {
		return personId;
	}


	public PersonEntity(int personId, String name, String email, String password, int age) {
		super();
		this.personId = personId;
		this.name = name;
		this.email = email;
		this.password = password;
		this.age = age;
	}


	public void setPersonId(int personId) {
		this.personId = personId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	
}
