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
@Table(name = "RBAC_ROLE_PERMISSION")
public class RolePermission extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3586559736162858597L;
	//½ÇÉ«id
	private String roleId;
	//Ðí¿Éid
	private String permissionId;
	

}
