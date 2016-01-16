package com.ms.rbac.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.ms.common.entity.BaseEntity;

@Entity
@Table(name = "RBAC_PERMISSION")
public class Permission extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7721880126937071356L;
	//父许可id
	private String parentId;
	//许可名称
	private String permissionName;
	//许可地址
	private String url;
	//资源
	//private String resourceId;
	//private String parentId;

	
	

}
