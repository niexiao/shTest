package com.niexiao.base.dao;

import java.io.Serializable;

import com.niexiao.base.exception.DAOException;

public abstract class HibernateBaseDao<T, ID extends Serializable> extends
		HibernateSimpleDao {

	@SuppressWarnings("unchecked")
	protected ID save(T entity) {
		return (ID) super.hibernateTemplate.save(entity);
	}

	protected void delete(T entity) {
		try {
			this.hibernateTemplate.delete(entity);
		} catch (Exception e) {
			super.log.error("删除数据失败," + e);
			throw new DAOException("删除数据失败," + e.getMessage());
		}
	}

	protected void delete(ID id) {
		delete(getEntityClass(), id);
	}

	protected void delete(Class<T> clazz, ID id) {
		try {
			Object o = this.hibernateTemplate.get(clazz, id);
			this.hibernateTemplate.delete(o);
		} catch (Exception e) {
			super.log.error("删除数据失败," + e);
			throw new DAOException("删除数据失败," + e.getMessage());
		}
	}

	/**
	 * 获得Dao对于的实体类
	 * 
	 * @return
	 */
	abstract protected Class<T> getEntityClass();
}
