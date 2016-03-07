package com.niexiao.dao.impl;

import org.springframework.stereotype.Repository;

import com.niexiao.base.dao.impl.BaseDaoImpl;
import com.niexiao.dao.UserDao;
import com.niexiao.entity.User;

@Repository
public class UserDaoImpl extends BaseDaoImpl<User, String> implements
		UserDao {
	public String saveUser(User user) {
		return save(user);
	}


//	@Override
//	public void deleteUser(String id) {
//		delete(id);
//	}
//
	@Override
	protected Class<User> getEntityClass() {
		return User.class;
	}
//
//	@Override
//	public User getUserById(String id) {
//		return super.getById(id);
//	}
}
