package com.niexiao.dao;

import java.io.Serializable;
import java.sql.SQLException;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.niexiao.model.User;

public interface UserDao {

	public String saveUser(User user);

	public void deleteUser(String id);
}
