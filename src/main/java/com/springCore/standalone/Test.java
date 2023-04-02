package com.springCore.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/standalone/standconfig.xml");
		
		Person person = (Person) context.getBean("person1",Person.class);
		
		System.out.println(person);
		
		
		System.out.println(person.getFeestructure().getClass().getName());
		
		
	}

}
