package com.springCore.ci;

import org.springframework.context;
public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/ci/ciconfig.xml");
		Person person = (Person)context.getBean("person1");
		System.out.println("Person");

	}

}
