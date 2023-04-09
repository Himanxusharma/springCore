package com.springCore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/stereotype/stconfig.xml");
		
		Student student =  context.getBean("name",Student.class);
		Student student2 =  context.getBean("name",Student.class);
		
		System.out.println(student.hashCode());
		System.out.println(student2.hashCode());
		
		
		ApplicationContext context2 = new ClassPathXmlApplicationContext("com/springCore/stereotype/stconfig.xml");
		
		Teacher teacher =  context.getBean("teacher",Teacher.class);
		Teacher teacher2 =  context.getBean("teacher",Teacher.class);
		
		
		System.out.println(teacher.hashCode());
		System.out.println(teacher2.hashCode());
		
		
		
		
		
		

	}

}
