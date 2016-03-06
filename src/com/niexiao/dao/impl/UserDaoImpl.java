package com.niexiao.dao.impl;

import org.springframework.stereotype.Repository;

import com.niexiao.base.dao.HibernateBaseDao;
import com.niexiao.dao.UserDao;
import com.niexiao.entity.User;

@Repository
public class UserDaoImpl extends HibernateBaseDao<User, String> implements
		UserDao {
	public String saveUser(User user) {
		return save(user);
	}

	@Override
	public void deleteUser(String id) {
		delete(id);
	}

	@Override
	protected Class<User> getEntityClass() {
		return User.class;
	}
}
