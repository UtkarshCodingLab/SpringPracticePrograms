package com.springconfiguration.removexmlannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
       
       Student student =context.getBean("std",Student.class);
       
       Subject sub = context.getBean("subject",Subject.class);
       
       System.out.println(student);
       
       System.out.println(sub);
    }
}
