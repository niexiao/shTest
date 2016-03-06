package com.niexiao.entity.base;

import javax.persistence.MappedSuperclass;

import com.niexiao.base.entity.BaseEntity;

@MappedSuperclass
public abstract class organizationEntity extends BaseEntity {

	protected String  name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
