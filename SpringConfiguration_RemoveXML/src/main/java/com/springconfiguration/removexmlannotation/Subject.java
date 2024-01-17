package com.springconfiguration.removexmlannotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Subject {
	
	@Value("Hindi")
	private String subject_name;
	
	@Value("63")
	private int marks;

	@Override
	public String toString() {
		return "Subject [subject_name=" + subject_name + ", marks=" + marks + "]";
	}
	
	
}
