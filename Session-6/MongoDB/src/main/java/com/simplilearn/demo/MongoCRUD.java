package com.simplilearn.demo;

import org.bson.Document;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Updates.set;

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
	
	public void read(String name) {
		
		Document document=collection.find(eq("name",name)).first();
		if(document!=null) {
			System.out.println("Document Found: "+document.toJson());
		}else {
			System.out.println("Document not Found");
		}
	}
	
	public void update(String name,String newName) {

		Document upadteddocument = collection.findOneAndUpdate(
				eq("name", name),
				set("name",newName)
				);
		if (upadteddocument != null) {
			System.out.println("Document Updated: " + upadteddocument.toJson());
		} else {
			System.out.println("Document not Found to Update");
		}
	}

}
