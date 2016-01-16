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
	
	//角色名称
	private String roleName;
	//父角色id
	private String parentId;
	//用户角色
	private List<UserRole> userRoles;
	

	public Role() {
	}
	
	@Column(length = 50)
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	@Column(length = 50)
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	
	@OneToMany(mappedBy = "role",cascade = {CascadeType.ALL},
			fetch = FetchType.LAZY) 
	public List<UserRole> getUserRoles() {
		return userRoles;
	}
	
	public void setUserRoles(List<UserRole> userRoles) {
		this.userRoles = userRoles;
	}
	
}
