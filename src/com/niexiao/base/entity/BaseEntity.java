package com.niexiao.base.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

public class BaseEntity implements Serializable {

	/**
	 * ID
	 */
	@Id
	protected String id;
	/**
	 * 备注
	 */
	protected String remark;

	/**
	 * 是否删除
	 */
	protected boolean deleted;
	/**
	 * 最后一次修改时间
	 */
	protected Timestamp modifiedTime;

	/**
	 * 创建时间
	 */
	protected Timestamp createTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public Timestamp getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(Timestamp modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public BaseEntity() {
		super();
		this.id = UUID.randomUUID().toString();
		this.remark = "";
		this.deleted = false;
		this.modifiedTime = new Timestamp(System.currentTimeMillis());
		this.createTime = this.modifiedTime;
	}

}
