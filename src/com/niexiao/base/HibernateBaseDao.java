package com.niexiao.base;

import java.io.Serializable;

public abstract class HibernateBaseDao<T, ID extends Serializable> extends
		HibernateSimpleDao {

	@SuppressWarnings("unchecked")
	protected ID save(T entity) {
		return (ID) super.hibernateTemplate.save(entity);
	}

}
