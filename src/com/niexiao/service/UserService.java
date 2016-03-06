package com.niexiao.service;

import com.niexiao.entity.User;

public interface UserService {

	public String addUser(User user);

	public void deleteUser(String id);

	public User getUserById(String id);
}
