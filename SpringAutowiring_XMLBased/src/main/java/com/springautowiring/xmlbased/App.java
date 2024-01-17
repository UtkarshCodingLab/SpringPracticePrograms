package com.springautowiring.xmlbased;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springautowiring/xmlbased/config.xml");
        
        Student student = context.getBean("st",Student.class);
        
        System.out.println(student);
    }
}
