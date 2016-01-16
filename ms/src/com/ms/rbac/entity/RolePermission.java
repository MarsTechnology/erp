package com.ms.rbac.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	private Role role;
	//Ðí¿Éid
	private Permission permission;
	
	public RolePermission() {
	}
	
	@ManyToOne(fetch = FetchType.EAGER) 
	@JoinColumn(name = "roleId", nullable = false)
	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	
	@ManyToOne(fetch = FetchType.EAGER) 
	@JoinColumn(name = "permissionId", nullable = false)
	public Permission getPermission() {
		return permission;
	}

	public void setPermission(Permission permission) {
		this.permission = permission;
	}

}
