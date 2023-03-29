package com.springCore.ci;

import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springCore.collections.Employee;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/ci/ciconfig.xml");
		Person person1 = (Person)context.getBean("person1"); //get bean or object from IOC
		System.out.println(person1);

	}

}
