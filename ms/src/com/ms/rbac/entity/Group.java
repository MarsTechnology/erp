package com.ms.rbac.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
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
	// id
	private String id;
	//��������
	private String groupName;
	//���ű��
	private String groupCode;
	//�ϼ�����
	private String parentGroup;
	//��Ա
	List<User> users;
	
	public Group() {
	}
	@Id
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Column(length = 32)
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	@Column(length = 32)
	public String getGroupCode() {
		return groupCode;
	}
	public void setGroupCode(String groupCode) {
		this.groupCode = groupCode;
	}
	@Column(length = 32)
	public String getParentGroup() {
		return parentGroup;
	}
	public void setParentGroup(String parentGroup) {
		this.parentGroup = parentGroup;
	}
	@OneToMany(mappedBy = "group",cascade = {CascadeType.ALL},
			fetch = FetchType.LAZY) //����Ĭ��ֵ
	public List<User> getUsers() {
		return users;
	}
	
	public void setUsers(List<User> users) {
		this.users = users;
	}
	
}
