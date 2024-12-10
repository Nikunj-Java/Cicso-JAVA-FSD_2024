package com.simplilearn.demo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyBookDetailsRepo extends MongoRepository<BookDetailsEntity, String>{

}
