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
@Table(name = "RBAC_GROUP")
public class Group extends BaseEntity {


	/**
	 * 
	 */
	private static final long serialVersionUID = -8206886492790425603L;

	//�ϼ�����
	private String parentId;
	//��������
	private String groupName;
	//�û�
	private List<User> users;
	
	public Group() {
	}
	
	@Column(length = 32,nullable = false)
	public String getParentId() {
		return parentId;
	}
	
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	
	@Column(length = 50,nullable = false, unique = true)
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	
	
	@OneToMany(mappedBy = "group",cascade = {CascadeType.ALL},
			fetch = FetchType.LAZY) 
	public List<User> getUsers() {
		return users;
	}
	
	public void setUsers(List<User> users) {
		this.users = users;
	}
}
