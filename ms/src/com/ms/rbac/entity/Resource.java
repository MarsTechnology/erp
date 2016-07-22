package com.ms.rbac.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

import com.ms.common.entity.BaseEntity;

@Entity
@Table(name = "RBAC_RESOURCE")
@Data
@EqualsAndHashCode(callSuper = false)
public class Resource extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2830587237302880511L;
	/**
	 * 上级id
	 */
	@Column(length = 32, nullable = false)
	private String parentId;
	/**
	 * 资源名称
	 */
	@Column(length = 50, nullable = false)
	private String resourceName;
	/**
	 * url
	 */
	@Column(length = 500)
	private String url;

	public Resource() {
	}

}
