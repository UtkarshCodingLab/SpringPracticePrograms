package com.springconfiguration.removexmlannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.springconfiguration.removexmlannotation")
public class config {
	
	@Bean
	@Primary
	public Address address() {
		return new Address("Gorwa","Vadodara","India");
	}
	
	@Bean
	public Address adderss1() {
		return new Address("Viman Nagar","Pune","India");
	}
	
	@Bean
	public Student std() {
		return new Student();
	}
	
	
	

}
