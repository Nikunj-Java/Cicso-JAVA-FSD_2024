package com.simplilearn.demo;

import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

public class App {
    public static void main(String[] args) {
    	
    	try (MongoClient mongoClient=  MongoClients.create("mongodb://localhost:27017")){
    		//access the Database
    		MongoDatabase database= mongoClient.getDatabase("cisco");
    		
    		//acccess the collection
    		MongoCollection<Document> collection=database.getCollection("employee");
    		
    		//create a document
    		
    		Document employee=new Document("name","cisco_user")
    				.append("email", "cisco_user@cisco.com");
    		
    		//insert the document
    		collection.insertOne(employee);
    		System.out.println("User Inserted Succesfully");
    	}
    	catch (Exception e) {
			// TODO: handle exception
		}
         
    }
}
