package com.springjdbcconfiguration.annotationbased;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {
	
	public static void main(String[] args) throws SQLException {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		JdbcTemplate jd = context.getBean("jdbc",JdbcTemplate.class);
		
		System.out.println(jd.getDataSource().getConnection());
		
		String sql = "insert into Student(roll_number,name,address) values(?,?,?)";
		
		int row=jd.update(sql,3,"Suryauday","Rewa");
		
		System.out.println("Successfully inserted "+row+"row");
		
	}

}
