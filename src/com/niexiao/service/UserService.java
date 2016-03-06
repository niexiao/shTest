package com.niexiao.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niexiao.dao.UserDao;
import com.niexiao.entity.User;

public interface UserService {

	public String addUser(User user);
	
	public void deleteUser(String id);
}
