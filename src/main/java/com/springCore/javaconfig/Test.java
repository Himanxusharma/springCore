package com.springCore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext; 

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new AnnotationConfigApplicationContext(javaconfig.class);
		
		Student student =  context.getBean("getStudent",Student.class);
		System.out.println(student);
		
		student.study();
		
		

	}

}
