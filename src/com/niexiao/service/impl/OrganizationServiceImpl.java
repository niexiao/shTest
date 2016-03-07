package com.niexiao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niexiao.base.dao.BaseDao;
import com.niexiao.base.service.impl.BaseServiceImpl;
import com.niexiao.dao.OrganizationDao;
import com.niexiao.entity.Organization;
import com.niexiao.service.OrganizationService;

@Service
public class OrganizationServiceImpl extends BaseServiceImpl<Organization, String> implements OrganizationService {

	@Autowired
	protected void setOrganizationDao(OrganizationDao organizationDao) {
		setBaseDao(organizationDao);
	}
	
}
