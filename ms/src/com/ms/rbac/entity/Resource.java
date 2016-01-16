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
	//
	//private String parentId;
	//
	//private String parentId;


	
	

}
