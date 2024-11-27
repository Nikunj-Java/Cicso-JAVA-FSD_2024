package com.springframework.setup;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
    	//BeanFactory factory=new XmlBeanFactory(resource);
    	
    	ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
    	
    	Welcome welcome=(Welcome) context.getBean("helloWorld");
    	welcome.getMessage();
    	
    	
        
    }
}
