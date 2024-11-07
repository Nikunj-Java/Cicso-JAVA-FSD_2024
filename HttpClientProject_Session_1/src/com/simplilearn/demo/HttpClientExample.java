package com.simplilearn.demo;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class HttpClientExample {
	
	public static void main(String[] args) {
		
		HttpClient client=HttpClient.newHttpClient();
		
		HttpRequest request=HttpRequest.newBuilder()
				.uri(URI.create("https://jsonplaceholder.typicode.com/posts/1"))
				.build();
		
		try {
			
			HttpResponse<String> response= client.send(request, BodyHandlers.ofString());
			
			System.out.println("Response Status Code: "+response.statusCode());
			System.out.println("Response Body: "+response.body());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
