package com.simplilearn.test;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest.BodyPublishers;

public class HttpClientPostExample {

    public static void main(String[] args) throws Exception {
        // Create an HttpClient instance
        HttpClient client = HttpClient.newHttpClient();

        // Define the JSON body for the POST request
        String json = """
            {
              "title": "foo",
              "body": "bar",
              "userId": 1
            }
            """;

        // Build the POST request
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts"))
                .header("Content-Type", "application/json")
                .POST(BodyPublishers.ofString(json))
                .build();

        // Send the request and get the response
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // Print the response body and status code
        System.out.println("Response Code: " + response.statusCode());
        System.out.println("Response Body: " + response.body());
    }
}
