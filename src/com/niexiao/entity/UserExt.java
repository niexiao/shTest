package com.niexiao.entity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import com.niexiao.base.entity.BaseEntity;

@Entity
public class UserExt extends BaseEntity {
	private String txt;
	
	public String getTxt() {
		return txt;
	}
	public void setTxt(String txt) {
		this.txt = txt;
	}
}
