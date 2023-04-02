package com.springCore.lifecycle;

import org.springframework.context.support.*;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/lifecycle/lcconfig.xml");
		CocaCola_xml cc = (CocaCola_xml)context.getBean("c1");
		context.registerShutdownHook();
		System.out.println(cc);
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		
		Sprite_annotations s = (Sprite_annotations) context.getBean("s1");

		System.out.println(s);
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		
		Pepsi_interface p = (Pepsi_interface) context.getBean("p1");

		System.out.println(p);
		System.out.println("+++++++++++++++++++++++++++++++++++++");

	}

}
