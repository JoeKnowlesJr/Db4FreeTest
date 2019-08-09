package com.joeknowles.Db4FreeTest;

import java.util.List;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class UserRepository {
	JdbcUserDao mDao;
	
	public UserRepository() {
		mDao = new JdbcUserDao(getDataSource());
		
	}
	
	public List<User> getAllUsers() {
		return mDao.getAllUsers();
	}
	
	public void insert(User u ) {
		mDao.insert(u);
	}
	
	
    public DriverManagerDataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://db4free.net:3306/jbk_merit_db");
        dataSource.setUsername("jkhippie");
        dataSource.setPassword("5da8ea58");
        return dataSource;
    }
}
