package com.simplilearn.demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteFileJava11 {
	
	public static void main(String[] args) {
		Path filePath=Paths.get("newfile1.txt");
	 
		try {
			
			Files.delete(filePath);
			System.out.println("File Deleted Successfully");
			
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("Exception: "+e);
		}
	}

}
