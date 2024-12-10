package com.simplilearn.demo;
 
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MyBookDetailsRepo extends MongoRepository<BookDetailsEntity, String>{

	 @Query(value="{'bookId': ?0}",fields = "{'price':1,'_id': 0}")
	 String findBookById(String bookId);

}
