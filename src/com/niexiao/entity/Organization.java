package com.niexiao.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.niexiao.entity.base.OrganizationEntity;

@Entity
@Table(name = "test_organization")
public class Organization extends OrganizationEntity {

}
