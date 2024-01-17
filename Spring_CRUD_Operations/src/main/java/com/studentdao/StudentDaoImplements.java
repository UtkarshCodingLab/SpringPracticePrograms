package com.studentdao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.springjbdccrud.model.Student;

public class StudentDaoImplements implements StudentDao{
	
	private JdbcTemplate jdbcTemplate;

	@Override
	public int insert(Student student) {
		// TODO Auto-generated method stub
		String sql = "insert into Student(roll_number,name,address) values(?,?,?)";
		int i = jdbcTemplate.update(sql,student.getRoll_number(),student.getName(),student.getAddress());
		return i;
	}

	public StudentDaoImplements(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int updateStudentDetails(Student student) {
		
		String sql = "update Student set name=? ,address=? where roll_number=?";
		int i = jdbcTemplate.update(sql,student.getName(),student.getAddress(),student.getRoll_number());
		return i;
	}

	@Override
	public int delete(int roll_number) {
		// TODO Auto-generated method stub
		String sql = "delete from Student where roll_number=?";
		int i = jdbcTemplate.update(sql,roll_number);
		return i;
	}

	@Override
	public Student selectStudentByRollNumber(int roll_number) {
		// TODO Auto-generated method stub
		String sql = "select * from Student where roll_number=?";
		
		RowMapper rowMapper = new RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				Student st = new Student();
				st.setRoll_number(rs.getInt(1));
				st.setName(rs.getString(2));
				st.setAddress(rs.getString(3));
				return st;
			}
			
		};
		
		Student st = (Student) jdbcTemplate.queryForObject(sql, rowMapper, roll_number);
		return st;
	}

	@Override
	public List<Student> selectAllStudents() {
		// TODO Auto-generated method stub
		String sql ="select * from Student";

		RowMapper rowMapper = new RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				Student st = new Student();
				st.setRoll_number(rs.getInt(1));
				st.setName(rs.getString(2));
				st.setAddress(rs.getString(3));
				return st;
			}
			
		};
		
		List<Student> studentList = jdbcTemplate.query(sql, rowMapper);
		
		return studentList;
	}
	

}
