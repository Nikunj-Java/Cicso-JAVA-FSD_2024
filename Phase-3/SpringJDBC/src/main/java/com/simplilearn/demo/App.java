package com.simplilearn.demo;

import java.sql.Connection;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext contxt=new ClassPathXmlApplicationContext("applicationContext.xml");
       
     
       
       DataSource data=(DataSource) contxt.getBean("dataSource");
       
       try(Connection conn= data.getConnection()) {
		if(conn!=null) {
			System.out.println("Database Connected");
		}else {
			System.out.println("Failed to connect");
		}
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("Exception: "+e);
	}
       
       
       
        
    }
}
