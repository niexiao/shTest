package com.niexiao.dao;

import com.niexiao.entity.User;

public interface UserDao {

	public String saveUser(User user);
	
	public User getUserById(String id);

	public void deleteUser(String id);
}
