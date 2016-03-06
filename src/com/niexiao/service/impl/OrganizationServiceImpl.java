package com.niexiao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niexiao.dao.OrganizationDao;
import com.niexiao.entity.Organization;
import com.niexiao.service.OrganizationService;

@Service
public class OrganizationServiceImpl implements OrganizationService {

	@Override
	public String addOrganization(Organization organization) {
		return organizationDao.addOrganization(organization);
	}

	@Override
	public Organization getOrganizationById(String id) {
		return organizationDao.getOrganizationById(id);
	}

	@Autowired
	private OrganizationDao organizationDao;
}
