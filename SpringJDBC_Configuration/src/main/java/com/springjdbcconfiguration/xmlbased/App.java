package com.springjdbcconfiguration.xmlbased;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springjdbcconfiguration/xmlbased/config.xml");
        
        JdbcTemplate jd = context.getBean("jdbcTemplate",JdbcTemplate.class);
        
        System.out.println(jd.getDataSource().getConnection());
        
        
        //insert query
        
        /*
        
        String sql ="insert into Student(roll_number,name,address) values(?,?,?)";
        
        int rows = jd.update(sql,2,"Neeraj","Vadodara");
        
        System.out.println("Successfully inserted "+rows+" row");
        
        */
        
        
        //update query
        
        /*
        
        String sql = "update Student set name=? where roll_number=?";
        
        int row = jd.update(sql,"Ashish",3);
        
        System.out.println("Successfully Updated "+row+" row");
        
        */
        
        
        //delete query
        
        /*
         
        String sql ="delete from Student where roll_number=?";
        
        int rows = jd.update(sql,2);
        
        System.out.println("Successfully Deleted "+rows+" rows");
        
        */
        
        
        //select Student by roll_number
        
        /*
      
        String sql = "select * from Student where roll_number = ?";
        
         RowMapper rowMapper = new RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				String address = rs.getString(3);
				return address;
			}
        	 
         };
         
         String address = (String) jd.queryForObject(sql, rowMapper, 1);
         
         System.out.println(address);
        
        */
        
        
        //select all records
        
        String sql = "select * from Student";
        
        RowMapper rowMapper = new RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				 String name = rs.getString(2);
				
				return name;
			}
        	
        };
        
        List<String> namesList = jd.query(sql, rowMapper);
        
        for(String name:namesList)
        {
        	System.out.println(name);
        }
    }
}



