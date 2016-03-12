package com.niexiao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niexiao.base.service.impl.BaseServiceImpl;
import com.niexiao.dao.MenuItemDao;
import com.niexiao.dao.OrganizationDao;
import com.niexiao.entity.MenuItem;
import com.niexiao.service.MenuItemService;

@Service
public class MenuItemServiceImpl extends BaseServiceImpl<MenuItem, String>
		implements MenuItemService {

	@Autowired
	protected void setMenuItemDao(MenuItemDao menuItemDao) {
		setBaseDao(menuItemDao);
	}
}
