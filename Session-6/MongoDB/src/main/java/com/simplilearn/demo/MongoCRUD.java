package com.simplilearn.demo;

import org.bson.Document;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoCRUD {
	
	
	private final MongoCollection<Document> collection;
	
	public MongoCRUD() {
		MongoDatabase database=MongoDbConnect.getDatabase();
		this.collection=database.getCollection("users");
	}
	
	public void create(String name,int age) {
		
		Document document=new  Document("name",name)
								.append("age", age);
		collection.insertOne(document);
		System.out.println("Document Inserted :" +document);
	}

}
