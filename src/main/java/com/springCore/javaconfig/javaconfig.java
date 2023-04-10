package com.springCore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration; 

@Configuration
//@ComponentScan(basePackages = "com.springCore.javaconfig")
public class javaconfig {
	
	
	
	public Fee getFee(){
			
		return new Fee();
		
	}
	
	
	
	
	@Bean
	public Student getStudent()	{
		
		//creating and return the object
		Student student = new Student(getFee());
		return student;
		
		}

}
