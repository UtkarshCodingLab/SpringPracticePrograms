package com.springjdbcconfiguration.annotationbased;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class Config {
	
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource datasource =  new DriverManagerDataSource();
		datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		datasource.setUrl("jdbc:mysql://localhost:3306/spring_jdbc");
		datasource.setUsername("root");
		datasource.setPassword("Utkar$h#09");
		return datasource;
	}
	
	@Bean("jdbc")
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate jd = new JdbcTemplate();
		jd.setDataSource(getDataSource());
		return jd;
	}

}
