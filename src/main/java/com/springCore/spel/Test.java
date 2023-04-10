package com.springCore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {


		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/spel/spelconfig.xml");
		
		SpelDemo d1 = context.getBean("spelDemo",SpelDemo.class);
		System.out.println(d1);
		
		SpelExpressionParser temp = new SpelExpressionParser();
		Expression expression  = temp.parseExpression("22+5");
		System.out.println(expression.getValue());
		
		

	}

}
