package com.niexiao.dao.impl;

import org.springframework.stereotype.Repository;

import com.niexiao.base.dao.impl.BaseDaoImpl;
import com.niexiao.dao.MenuItemDao;
import com.niexiao.entity.MenuItem;

@Repository
public class MenuItemDaoImpl extends BaseDaoImpl<MenuItem, String> implements
		MenuItemDao {

	@Override
	protected Class<MenuItem> getEntityClass() {
		return MenuItem.class;
	}
}
