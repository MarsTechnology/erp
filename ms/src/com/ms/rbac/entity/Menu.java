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
	//���˵�id
	private String parentId;
	//�˵�����
	private String menuName;
	//���
	//չʾ˳��
	private Integer dispalyIndex;
	//
	
	
	
	

}
