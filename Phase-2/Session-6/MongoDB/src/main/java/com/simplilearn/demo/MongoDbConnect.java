package com.simplilearn.demo;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class MongoDbConnect {
	
	private static final String CONN_STRING="mongodb://localhost:27017";
	private static final String CONN_DATABASE_NAME="ciscodb";
	
	public static MongoDatabase getDatabase() {
		MongoClient mongoClient= MongoClients.create(CONN_STRING);
		return mongoClient.getDatabase(CONN_DATABASE_NAME);
	}

}
