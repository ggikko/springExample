package com.ggikko.diExample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {

		String configuration1 = "classpath:applicationContext1.xml";
		String configuration2 = "classpath:applicationContext2.xml";

		AbstractApplicationContext ctx = new GenericXmlApplicationContext(
				configuration1, configuration2);
	
		Person1 person1 = ctx.getBean("person1", Person1.class);
		System.out.println(person1.getName());
		System.out.println(person1.getAge());
		System.out.println(person1.getHeight());
		System.out.println(person1.getHobby());
		
		Person2 person2 = ctx.getBean("person2", Person2.class);
		System.out.println(person2.getName());
		System.out.println(person2.getAge());
		System.out.println(person2.getHeight());
		System.out.println(person2.getHobby());
		
		AnnotationConfigApplicationContext ctx1 = new AnnotationConfigApplicationContext(ApplicationContext3.class);
		Person2 person3 = ctx1.getBean("person3", Person2.class);
		System.out.println(person3.getName());
		System.out.println(person3.getAge());
		System.out.println(person3.getHeight());
		System.out.println(person3.getHobby());
		
		
	}
}
