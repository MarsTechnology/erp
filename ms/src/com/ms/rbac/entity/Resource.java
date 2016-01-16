package com.ms.rbac.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.ms.common.entity.BaseEntity;

@Entity
@Table(name = "RBAC_RESOURCE")
public class Resource extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2830587237302880511L;
	//父资源id
	private String parentId;
	//资源名称
	private String resourceName;
	//url
	private String url;
	
	public Resource() {
	}
	
	@Column(length = 32,nullable = false)
	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	
	@Column(length = 50,nullable = false)
	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	
	@Column(length = 500)
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
