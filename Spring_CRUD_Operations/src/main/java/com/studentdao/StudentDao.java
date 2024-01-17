package com.studentdao;

import java.util.List;

import com.springjbdccrud.model.Student;

public interface StudentDao {
	
	public int insert(Student student);
	
	public int updateStudentDetails(Student student);
	
	public int delete(int roll_number);
	
	public Student selectStudentByRollNumber(int roll_number);
	
	public List<Student> selectAllStudents();

}
