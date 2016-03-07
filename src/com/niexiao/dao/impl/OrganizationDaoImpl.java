package com.niexiao.dao.impl;

import org.springframework.stereotype.Repository;

import com.niexiao.base.dao.impl.BaseDaoImpl;
import com.niexiao.dao.OrganizationDao;
import com.niexiao.entity.Organization;

@Repository
public class OrganizationDaoImpl extends BaseDaoImpl<Organization, String>
		implements OrganizationDao {

	@Override
	protected Class<Organization> getEntityClass() {
		return Organization.class;
	}
}
