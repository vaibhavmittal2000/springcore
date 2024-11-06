package com.springcore.stereo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/stereo/stereoconfig.xml");
//		Student student=(Student) context.getBean("student"); //By default
		Student student=(Student) context.getBean("ob");
		System.out.println(student);
		System.out.println(student.hashCode());
		
		Student student1=(Student) context.getBean("ob");
		System.out.println(student1);
		System.out.println(student1.hashCode());
	}
}
