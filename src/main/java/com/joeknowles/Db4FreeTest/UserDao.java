package com.joeknowles.Db4FreeTest;

import java.util.List;

public interface UserDao {
	void insert(User u);
	User findUserById(int userId);
	List<User> getAllUsers();
}