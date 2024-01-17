package com.springstereotype.annotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("st")
public class Student {
	
	@Value("101")
	private int id;
	
	@Value("Messi")
	private String name;
	
	@Value("#{sub}")
	private List<String> subjectsTaken;
	
	@Value("#{(2>3) ? 'Yes' : 'No'}")
	public String ternaryCheck;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("ID Setter Method Called");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Name Setter Method Called");
		this.name = name;
	}

	public List<String> getSubjectsTaken() {
		return subjectsTaken;
	}

	public void setSubjectsTaken(List<String> subjectsTaken) {
		System.out.println("Subjects Setter Method Called");
		this.subjectsTaken = subjectsTaken;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", subjectsTaken=" + subjectsTaken + "]";
	}

	
	
	
	

}
