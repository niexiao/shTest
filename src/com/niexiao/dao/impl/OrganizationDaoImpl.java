package com.niexiao.dao.impl;

import org.springframework.stereotype.Repository;

import com.niexiao.base.dao.HibernateBaseDao;
import com.niexiao.dao.OrganizationDao;
import com.niexiao.entity.Organization;

@Repository
public class OrganizationDaoImpl extends HibernateBaseDao<Organization, String>
		implements OrganizationDao {

	@Override
	public String addOrganization(Organization organization) {
		return super.save(organization);
	}

	@Override
	public Organization getOrganizationById(String id) {
		return super.getById(id);
	}

	@Override
	protected Class<Organization> getEntityClass() {
		return Organization.class;
	}

}
