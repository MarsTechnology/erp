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

import com.ms.common.entity.BaseEntity;

@Entity
@Table(name = "RBAC_GROUP")
@Data
@EqualsAndHashCode(callSuper = true)
public class Group extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8206886492790425603L;

	/**
	 * 上级部门
	 */
	@Column(length = 32, nullable = false)
	private String parentId;
	/**
	 * 部门名称
	 */
	@Column(length = 50, nullable = false, unique = true)
	private String groupName;
	/**
	 * 用户
	 */
	@OneToMany(mappedBy = "group", cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
	private List<User> users;

	public Group() {
	}

}
