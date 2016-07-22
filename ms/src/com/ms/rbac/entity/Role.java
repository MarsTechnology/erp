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
@Table(name = "RBAC_ROLE")
public class Role extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1719051428407174595L;
	/**
	 * 上级id
	 */
	@Column(length = 32, nullable = false)
	private String parentId;
	/**
	 * 角色名称
	 */
	@Column(length = 50, nullable = false)
	private String roleName;
	/**
	 * 用户角色
	 */
	@OneToMany(mappedBy = "role", cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
	private List<UserRole> userRoles;
	/**
	 * 用户许可
	 */
	@OneToMany(mappedBy = "permission", cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
	private List<RolePermission> rps;

	public Role() {
	}

}
