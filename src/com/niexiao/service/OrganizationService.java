package com.niexiao.service;

import com.niexiao.entity.Organization;

public interface OrganizationService {

	public String addOrganization(Organization organization);

	public Organization getOrganizationById(String id);
}
