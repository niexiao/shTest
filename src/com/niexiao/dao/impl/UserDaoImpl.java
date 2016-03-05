package com.niexiao.dao.impl;

import java.io.Serializable;
import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.niexiao.base.HibernateBaseDao;
import com.niexiao.dao.UserDao;
import com.niexiao.model.User;

@Repository
public class UserDaoImpl extends HibernateBaseDao<User, String> implements
		UserDao {

	// private HibernateTemplate hibernateTemplate;
	//
	// @Autowired
	// public void setSessionFactory(SessionFactory sessionFactory) {
	// this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	// }

	// private SessionFactory sessionFactory;
	//
	// @Autowired
	// public void setSessionFactory(SessionFactory sessionFactory) {
	// this.sessionFactory = sessionFactory;
	// }
	//
	// protected Session getSession() {
	// return sessionFactory.getCurrentSession();
	// }

	public String saveUser(User user) {
		// this.sessionFactory.getCurrentSession().save(user);
		return save(user);

		// new HibernateTemplate(sessionFactory).save(user);
		// hibernateTemplate.save(user);
	}
}
