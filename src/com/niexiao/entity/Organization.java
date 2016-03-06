package com.niexiao.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.niexiao.entity.base.organizationEntity;

@Entity
@Table(name="test_organization")
public class Organization extends organizationEntity {

	@OneToMany(cascade={CascadeType.ALL},mappedBy="organization")
	private Set<User> users;

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}
	
	
	
}
