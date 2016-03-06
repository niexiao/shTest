package com.niexiao.entity.base;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.niexiao.base.entity.BaseEntity;
import com.niexiao.entity.Organization;
import com.niexiao.entity.UserExt;


@MappedSuperclass
public abstract class UserEntity extends BaseEntity {
	protected String name;
	protected String password;
	
	@ManyToOne
	@JoinColumn(name="organization_id")
	protected Organization organization;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Organization getOraganzation() {
		return organization;
	}

	public void setOraganzation(Organization oraganzation) {
		this.organization = oraganzation;
	}
	
}
