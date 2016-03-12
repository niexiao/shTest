package com.niexiao.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.niexiao.entity.base.MenuItemEntity;

@Entity
@Table(name = "test_menu")
public class MenuItem extends MenuItemEntity {

}
