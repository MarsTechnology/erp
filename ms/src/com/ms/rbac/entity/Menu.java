package com.ms.rbac.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.ms.common.entity.BaseEntity;

@Entity
@Table(name = "RBAC_MENU")
public class Menu extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -124854113194012537L;
	//父菜单id
	private String parentId;
	//菜单名称
	private String menuName;
	//许可
	//展示顺序
	private Integer dispalyIndex;
	//
	
	
	
	

}
