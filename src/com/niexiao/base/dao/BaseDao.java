package com.niexiao.base.dao;

import java.io.Serializable;

public interface BaseDao<T, ID extends Serializable> extends CommonDao {

	public T findById(ID id);

	public ID save(T entity); 

	public void delete(T entity); 
	
	public void delete(ID id); 

	public void delete(Class<T> clazz, ID id) ;
}
