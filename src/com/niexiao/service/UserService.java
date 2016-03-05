package com.niexiao.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niexiao.dao.UserDao;
import com.niexiao.model.User;

public interface UserService {

	public String addUser(User user);
}
