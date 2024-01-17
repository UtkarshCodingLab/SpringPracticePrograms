package com.springbeanlifecycle.annotationbased;

import java.util.ArrayList;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
 public static void main(String[] args) {
	AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springbeanlifecycle/annotationbased/config.xml");
	
	context.registerShutdownHook();
	
	Student student = context.getBean("st",Student.class);
	
	System.out.println(student);
	
}
}
