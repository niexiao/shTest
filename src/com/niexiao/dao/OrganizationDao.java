package com.niexiao.dao;

import com.niexiao.entity.Organization;

public interface OrganizationDao {

	public String addOrganization(Organization organization);
	
	public Organization getOrganizationById(String id);
}
