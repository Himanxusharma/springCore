package com.springCore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/stereotype/stconfig.xml");
		
		Student student =  context.getBean("student",Student.class);
		
		System.out.println(student);
		

	}

}
