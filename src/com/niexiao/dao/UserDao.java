package com.niexiao.dao;

import java.util.List;

import com.niexiao.base.dao.BaseDao;
import com.niexiao.entity.User;

public interface UserDao extends BaseDao<User, String> {

	List<User> getAllUsers();

//	public String saveUser(User user);
//	
//	public User getUserById(String id);
//
//	public void deleteUser(String id);
}
