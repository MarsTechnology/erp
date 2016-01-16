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

import com.ms.common.entity.BaseEntity;

@Entity
@Table(name = "RBAC_PERMISSION")
public class Permission extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7721880126937071356L;
	//父许可id
	private String parentId;
	//许可名称
	private String permissionName;
	//许可地址
	private String url;
	//菜单
	private Menu menu;
	//资源
	//private Resource resource
	//角色许可
	private List<RolePermission> rps;
	
	public Permission() {
	}
	
	@Column(length = 32,nullable = false)
	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	@Column(length = 50,nullable = false)
	public String getPermissionName() {
		return permissionName;
	}

	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	@ManyToOne(fetch = FetchType.EAGER) 
	@JoinColumn(name = "menuId", nullable = false)
	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	
	@OneToMany(mappedBy = "permission",cascade = {CascadeType.ALL},
			fetch = FetchType.LAZY) 
	public List<RolePermission> getRps() {
		return rps;
	}
	
	public void setRps(List<RolePermission> rps) {
		this.rps = rps;
	}
}
