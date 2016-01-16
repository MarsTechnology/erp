package com.ms.emp.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.ms.common.entity.BaseEntity;
import com.ms.rbac.entity.Group;
import com.ms.rbac.entity.User;
@Entity
@Table(name = "EMP")
public class Emp extends BaseEntity {

	/**
	 * 员工信息实体类
	 */
	private static final long serialVersionUID = -7692262598266462690L;
	//员工姓名
	private String empName;
	//部门
	private Group group;
	//用户
	private User user;
	
	
	public Emp() {
	}
	
	@Column(length = 50)
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@ManyToOne(fetch = FetchType.EAGER) 
	@JoinColumn(name = "groupId", nullable = false)
	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}
	@OneToOne(mappedBy = "emp",cascade = {CascadeType.ALL},
			fetch = FetchType.LAZY) 
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
}
