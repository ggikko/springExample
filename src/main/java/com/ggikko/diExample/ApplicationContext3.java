package com.ggikko.diExample;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationContext3 {
	
	@Bean
	public Person2 person3(){
		
		Person2 person3 = new Person2();
		person3.setName("지홍홍님");
		person3.setAge(30);
		person3.setHeight(184.3);
		
		ArrayList<String> hobby = new ArrayList<String>();
		hobby.add("탁구");
		hobby.add("요리");
		
		person3.setHobby(hobby);
		
		
		return person3;
		
	}


	
	
}
