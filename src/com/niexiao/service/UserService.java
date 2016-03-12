package com.niexiao.service;

import java.util.List;

import com.niexiao.base.service.BaseService;
import com.niexiao.entity.User;

public interface UserService extends BaseService<User, String> {
	//
	// public String addUser(User user);
	//
	// public void deleteUser(String id);
	//
	// public User getUserById(String id);

	List<User> getAllUsers();
}
