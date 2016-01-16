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
@Table(name = "RBAC_MENU")
public class Menu extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -124854113194012537L;
	//���˵�id
	private String parentId;
	//�˵�����
	private String menuName;
	//���
	private List<Permission> permissions;
	//չʾ˳��
	private Integer dispalyIndex;
	//url
	private String url;
	
	public Menu() {
	}
	
	@Column(length = 32,nullable = false)
	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	
	@Column(length = 50,nullable = false)
	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	
	
	@Column(length = 3,nullable = false)
	public Integer getDispalyIndex() {
		return dispalyIndex;
	}

	public void setDispalyIndex(Integer dispalyIndex) {
		this.dispalyIndex = dispalyIndex;
	}
	@Column(length = 500)
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	@OneToMany(mappedBy = "menu",cascade={CascadeType.ALL},fetch = FetchType.LAZY)
	public List<Permission> getPermissions() {
		return permissions;
	}
	
	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}

}
