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
	//�����id
	private String parentId;
	//�������
	private String permissionName;
	//��ɵ�ַ
	private String url;
	//��Դ
	//private String resourceId;
	//private String parentId;

	
	

}
