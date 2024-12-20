package com.simplilearn.demo;

import org.bson.Document;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Updates.set;

import java.util.List;

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
	
	public void delete(String name) {
		Document deletedocument=collection.findOneAndDelete(eq("name",name));
		
		if(deletedocument!=null) {
			System.out.println("Document Deleted: "+deletedocument.toJson());
		}
		
		
	}
	
	public void insertMany(List<Document> documents) {
		
		if(documents ==null || documents.isEmpty()) {
			System.out.println("No document provided for insertion");
			return;
		} 
		collection.insertMany(documents);
		System.out.println(documents.size()+ "Documents inserted successfully");
	}
	
	public void deletemany(String name,String value) {
	 long deleteCount=collection.deleteMany(eq(name,value)).getDeletedCount();
	 
	 System.out.println(deleteCount+ " documents deleted with "+ name + " = "+ value);;
		
		
	}

}
