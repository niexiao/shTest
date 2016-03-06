package com.niexiao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niexiao.dao.UserDao;
import com.niexiao.entity.User;
import com.niexiao.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private UserDao userDao;

	@Autowired
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public String addUser(User user) {
		return this.userDao.saveUser(user);
	}

	@Override
	public void deleteUser(String id) {
		this.userDao.deleteUser(id);
	}

	public User getUserById(String id) {
		return this.userDao.getUserById(id);
	}

}
