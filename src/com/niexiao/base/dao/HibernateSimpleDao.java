package com.niexiao.base.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.util.Assert;

public abstract class HibernateSimpleDao {

	/**
	 * 用于记录日志
	 */
	protected Logger log = LoggerFactory.getLogger(getClass());

	@Autowired
	protected HibernateTemplate hibernateTemplate;

	
}
