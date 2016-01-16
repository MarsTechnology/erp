package com.ms.rbac.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.ms.common.entity.BaseEntity;

@Entity
@Table(name = "RBAC_USER_ROLE")
public class UserRole extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2745625849626114020L;
	//ÓÃ»§
	private User user;
	//½ÇÉ«
	private Role role;
	
	public UserRole() {

	}
	@ManyToOne(fetch = FetchType.EAGER) 
	@JoinColumn(name = "userId", nullable = false)
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	@ManyToOne(fetch = FetchType.EAGER) 
	@JoinColumn(name = "roleId", nullable = false)
	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	
}
