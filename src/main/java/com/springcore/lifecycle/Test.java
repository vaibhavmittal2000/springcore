package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		context.registerShutdownHook(); //To implement destroy method
//		Item it=(Item)context.getBean("food");
//		System.out.println(it);
//		
//		System.out.println("+++++++++++++++++++");
//		Fruit fr=(Fruit)context.getBean("apps");
//		System.out.println(fr);
		
		Drinks pro=(Drinks)context.getBean("pep");
		System.out.println(pro);
	}
}