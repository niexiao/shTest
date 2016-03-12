package com.niexiao.entity.base;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

import com.niexiao.base.entity.BaseEntity;
import com.niexiao.entity.MenuItem;

@MappedSuperclass
public abstract class MenuItemEntity extends BaseEntity {

	protected String name;
	protected String description;
	/**
	 * 优先级，用于排序
	 */
	protected int priority;
	protected String url;

	@ManyToOne
	@JoinColumn(name = "father_id")
	protected MenuItem father;

	@OneToMany(cascade = { CascadeType.ALL }, mappedBy = "father")
	protected Set<MenuItem> children;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public MenuItem getFather() {
		return father;
	}

	public void setFather(MenuItem father) {
		this.father = father;
	}

	public Set<MenuItem> getChildren() {
		return children;
	}

	public void setChildren(Set<MenuItem> children) {
		this.children = children;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}
	

}
