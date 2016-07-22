package com.ms.rbac.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

import com.ms.common.entity.BaseEntity;

@Entity
@Table(name = "RBAC_PERMISSION")
@Data
@EqualsAndHashCode(callSuper = false)
public class Permission extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7721880126937071356L;
	/**
	 * 上级id
	 */
	@Column(length = 32, nullable = false)
	private String parentId;
	/**
	 * 许可名称
	 */
	@Column(length = 50, nullable = false)
	private String permissionName;
	/**
	 * urlַ
	 */
	@Column(length = 500)
	private String url;
	/**
	 * 菜单
	 */
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "menuId", nullable = false)
	private Menu menu;
	// ��Դ
	// private Resource resource
	/**
	 * 角色许可
	 */
	@OneToMany(mappedBy = "permission", cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
	private List<RolePermission> rps;

	public Permission() {
	}

}
