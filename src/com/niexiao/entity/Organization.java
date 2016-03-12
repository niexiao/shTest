package com.niexiao.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.niexiao.entity.base.OrganizationEntity;

@Entity
@Table(name = "test_organization")
public class Organization extends OrganizationEntity {


}
