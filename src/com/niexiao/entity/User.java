package com.niexiao.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.niexiao.entity.base.UserEntity;

@Entity
@Table(name = "test_user")
public class User extends UserEntity {

}
