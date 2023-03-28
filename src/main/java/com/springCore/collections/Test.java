package com.springCore.collections;

import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/collections/collectionconfig.xml"); //create object
		Employee employee1 = (Employee)context.getBean("Employee1"); //get bean or object from IOC
		System.out.println(employee1);

	}

}
