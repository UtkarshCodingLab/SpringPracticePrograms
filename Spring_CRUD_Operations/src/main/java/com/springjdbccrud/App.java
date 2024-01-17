package com.springjdbccrud;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springjbdccrud.model.Student;
import com.studentdao.StudentDaoImplements;
import java.util.Scanner;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springjdbccrud/config.xml");
        
        JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate",JdbcTemplate.class);
        
        System.out.println(jdbcTemplate.getDataSource().getConnection());
        
        Student st = context.getBean("stud",Student.class);
        
        StudentDaoImplements dao = context.getBean("studdao",StudentDaoImplements.class);
        
        // data insertion
        
        /*
        int rows = dao.insert(st);
        
        System.out.println(rows+" Student Record Inserted Successfully");
        
        */
        
        // data updation
        
        /*
        System.out.println("Enter New Address");
        Scanner sc = new Scanner(System.in);
        String newName = sc.nextLine();
        
        st.setAddress(newName);
        int rows = dao.updateStudentDetails(st);
        
        System.out.println(rows+" Student Record Updated Successfully");
        
       */
        
        // data deletion
        
        /*
         
        int rows = dao.delete(5);
        
        System.out.println(rows+" Student Record Deleted Successfully");
        
        */
        
        // selectStudentbyRollNumber
        
        /*
        Student stud = dao.selectStudentByRollNumber(4);
        
        System.out.println(stud);
        */
        
        // selectAllStudentsRecords
        
        List<Student> studRecords  = dao.selectAllStudents();
        
        for(Student std: studRecords)
        {
        	System.out.println(std);
        }
        
    }
}
