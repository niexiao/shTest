package com.niexiao.base.dao.impl;

import java.io.Serializable;

import com.niexiao.base.dao.BaseDao;
import com.niexiao.base.exception.DAOException;

public abstract class BaseDaoImpl<T, ID extends Serializable> extends
		CommonDaoImpl  implements BaseDao<T, ID>{

	public T findById(ID id) {
		try {
			return this.getHibernateTemplate().get(getEntityClass(), id);
		} catch (Exception e) {
			super.log.error("获取数据失败," + e);
			throw new DAOException("获取数据失败," + e.getMessage());
		}
	}

	@SuppressWarnings("unchecked")
	public ID save(T entity) {
		return (ID) super.getHibernateTemplate().save(entity);
	}

	public void delete(T entity) {
		try {
			this.getHibernateTemplate().delete(entity);
		} catch (Exception e) {
			super.log.error("删除数据失败," + e);
			throw new DAOException("删除数据失败," + e.getMessage());
		}
	}

	public void delete(ID id) {
		delete(getEntityClass(), id);
	}

	public void delete(Class<T> clazz, ID id) {
		try {
			Object o = this.getHibernateTemplate().get(clazz, id);
			this.getHibernateTemplate().delete(o);
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
