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
	/**
	 * 角色
	 */
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "roleId", nullable = false)
	private Role role;
	/**
	 * 许可
	 */
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "permissionId", nullable = false)
	private Permission permission;

	public RolePermission() {
	}

}
