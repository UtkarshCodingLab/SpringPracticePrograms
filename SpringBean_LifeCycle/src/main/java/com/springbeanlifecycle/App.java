package com.springbeanlifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springbeanlifecycle/config.xml");
       
       context.registerShutdownHook();
       
       Student student = context.getBean("st",Student.class);
       
       System.out.println(student);
       
    }
}
