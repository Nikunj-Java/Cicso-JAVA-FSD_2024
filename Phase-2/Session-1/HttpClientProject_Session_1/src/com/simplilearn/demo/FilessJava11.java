package com.simplilearn.demo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FilessJava11 {

	public static void main(String[] args) {
		
		Path path=Paths.get("newfile1.txt");
		String content="101,jhon\n201,fionna\n301,mike";
		try {
			
			if(!Files.exists(path)) {
				Files.createFile(path);
				System.out.println("File Created");
			}
			else {
				//System.out.println("File Already Exist");
				Files.write(path, content.getBytes(), StandardOpenOption.CREATE,StandardOpenOption.APPEND);
				System.out.println("Content Added Successfully");
			}
			
			
			//Path studentsPath=Files.createTempFile(tempDirPath, "students", ".txt");
			
			
			//Path fileContent=Files.writeString(studentsPath, content);
			
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("Exception is: "+e);
		}
		
	}
}
