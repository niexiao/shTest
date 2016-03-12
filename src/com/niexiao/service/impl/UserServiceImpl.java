package com.niexiao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niexiao.base.dao.BaseDao;
import com.niexiao.base.service.impl.BaseServiceImpl;
import com.niexiao.dao.UserDao;
import com.niexiao.entity.User;
import com.niexiao.service.UserService;

@Service
public class UserServiceImpl extends BaseServiceImpl<User, String> implements
		UserService {
	@Autowired
	protected void setUserDao(UserDao userDao) {
		setBaseDao(userDao);
	}

	protected UserDao getUserDao() {
		return (UserDao) this.baseDao;
	}

	@Override
	public List<User> getAllUsers() {

		return (List<User>) getUserDao().getAllUsers();
	}
}
