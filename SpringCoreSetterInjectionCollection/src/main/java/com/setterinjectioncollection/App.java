package com.setterinjectioncollection;
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
        ApplicationContext context = new ClassPathXmlApplicationContext("com/setterinjectioncollection/config.xml");
        Student std = context.getBean("std1",Student.class);
        
        System.out.println(std);
        
        
        
    }
}
