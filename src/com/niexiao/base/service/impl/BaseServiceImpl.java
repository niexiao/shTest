package com.niexiao.base.service.impl;

import java.io.Serializable;

import com.niexiao.base.dao.BaseDao;
import com.niexiao.base.service.BaseService;

public abstract class BaseServiceImpl<T, ID extends Serializable> implements BaseService<T, ID> {
	
	protected BaseDao<T,ID> baseDao;

	protected void setBaseDao(BaseDao<T,ID> baseDao) {
		this.baseDao = baseDao;
	}

	@Override
	public ID add(T entity) {
		return this.baseDao.save(entity);
	}

	@Override
	public void delete(ID id) {
		this.baseDao.delete(id);
	}

	@Override
	public T findById(ID id) {
		return this.baseDao.findById(id);
	}
}