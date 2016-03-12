package com.niexiao.dao.impl;

import org.springframework.stereotype.Repository;

import com.niexiao.base.dao.impl.BaseDaoImpl;
import com.niexiao.dao.DictionaryDao;
import com.niexiao.entity.Dictionary;

@Repository
public class DictionaryDaoImpl extends BaseDaoImpl<Dictionary, String>
		implements DictionaryDao {

	@Override
	protected Class<Dictionary> getEntityClass() {
		return Dictionary.class;
	}

}
