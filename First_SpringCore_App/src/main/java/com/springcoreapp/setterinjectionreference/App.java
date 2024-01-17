package com.springcoreapp.setterinjectionreference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		 
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcoreapp/setterinjectionreference/config.xml");
		
		Student std1 = context.getBean("std1",Student.class);
		
		System.out.println(std1.getName());
		System.out.println(std1.getAddress().getCountry());
	}

}
