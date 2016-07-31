package com.ms.rbac.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

import com.ms.common.entity.BaseEntity;

@Entity
@Table(name = "RBAC_USER_ROLE")
@Data
@EqualsAndHashCode(callSuper = false)
public class UserRole extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2745625849626114020L;
	/**
	 * 用户
	 */
	@Id
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "userId", nullable = false)
	private User user;
	/**
	 * 角色
	 */
	@Id
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "roleId", nullable = false)
	private Role role;

	public UserRole() {

	}

}
