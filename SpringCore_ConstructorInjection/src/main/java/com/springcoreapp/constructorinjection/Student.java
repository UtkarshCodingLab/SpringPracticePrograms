package com.springcoreapp.constructorinjection;

import java.util.List;
import java.util.Set;

public class Student {
    
	private int roll_no;
	
	private String name;
	
	private Set<String> subject;
	
	private List<Integer> marks;
	
	private Address address;

	public Student(int roll_no, String name, Set<String> subject, List<Integer> marks, Address address) {
		super();
		this.roll_no = roll_no;
		this.name = name;
		this.subject = subject;
		this.marks = marks;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [roll_no=" + roll_no + ", name=" + name + ", subject=" + subject + ", marks=" + marks
				+ ", address=" + address + "]";
	}
	
	
}
