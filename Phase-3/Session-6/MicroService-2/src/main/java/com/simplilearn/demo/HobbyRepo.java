package com.simplilearn.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface HobbyRepo extends JpaRepository<HobbyEntity, Integer>{

	@Query("select h.Hobby from HobbyEntity h where h.personId=:personId")
	public String findByPersonId(int personId);
}
