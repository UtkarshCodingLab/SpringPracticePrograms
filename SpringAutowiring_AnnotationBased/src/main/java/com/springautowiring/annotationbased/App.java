package com.springautowiring.annotationbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("com/springautowiring/annotationbased/config.xml");
       
       Student st = context.getBean("st",Student.class);
       
       System.out.println(st);
    }
}
