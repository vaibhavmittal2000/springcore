package com.springcore.collections.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/collections/standalone/standaloneconfig.xml");
		Person p = (Person) context.getBean("person1");
		System.out.println(p.getFriends());
		System.out.println(p.getFriends().getClass().getName());
		System.out.println("++++++++++++++++++++++++++++++++");
		System.out.println(p.getFeestructure());
		System.out.println(p.getFeestructure().getClass().getName());
		System.out.println("++++++++++++++++++++++++++++++++");
		System.out.println(p.getProps());
		System.out.println(p.getProps().getClass().getName());
	}
}