package com.ms.rbac.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

import com.ms.common.entity.BaseEntityUUID;

@Entity
@Table(name = "RBAC_MENU")
@Data
@EqualsAndHashCode(callSuper = false)
public class Menu extends BaseEntityUUID {

	/**
	 * 
	 */
	private static final long serialVersionUID = -124854113194012537L;
	/**
	 * 上级id
	 */
	@Column(length = 32, nullable = false)
	private String parentId;
	/**
	 * 菜单名称
	 */
	@Column(length = 50, nullable = false)
	private String menuName;
	/**
	 * 许可
	 */
	@OneToMany(mappedBy = "menu", cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
	private List<Permission> permissions;
	/**
	 * 展示顺序
	 */
	@Column(length = 3, nullable = false)
	private Integer dispalyIndex;
	/**
	 * url
	 */
	@Column(length = 500)
	private String url;

	public Menu() {
	}

}
