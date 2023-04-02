package com.springCore.autowire.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/autowire/xml/autoconfig.xml");
		Employee emp =  context.getBean("emp",Employee.class);
		System.out.println(emp);
		

	}

}
