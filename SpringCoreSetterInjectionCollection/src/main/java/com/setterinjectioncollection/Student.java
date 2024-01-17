package com.setterinjectioncollection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	
	private String name;
	
	private List<Integer> Marks;
	
	private Set<String> TeacherNames;
	
	private Map<String, String> course;
	
	

	@Override
	public String toString() {
		return "Student [name=" + name + ", Marks=" + Marks + ", TeacherNames=" + TeacherNames + ", course=" + course
				+ "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List getMarks() {
		return Marks;
	}

	public void setMarks(List marks) {
		Marks = marks;
	}

	public Set getTeacherNames() {
		return TeacherNames;
	}

	public void setTeacherNames(Set teacherNames) {
		TeacherNames = teacherNames;
	}

	public Map<String, String> getCourse() {
		return course;
	}

	public void setCourse(Map<String, String> course) {
		this.course = course;
	}
	
	
	
	

}
