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
@Table(name = "RBAC_USER")
public class User extends BaseEntity {

	private static final long serialVersionUID = 2698479255878048424L;
	//登录名称
	private String logName;
	// 密码
	private String password;
	// 邮箱
	private String email;
	// 状态锁
	/*@Column(length = 32)
	private String lock;*/
	//员工
	//private Emp emp;
	//部门
	private Group group;
	//用户角色
	private List<UserRole> userRoles;
	
	public User() {
	}
	
	@Column(length = 50,nullable = false)
	public String getLogName() {
		return logName;
	}
	
	public void setLogName(String logName) {
		this.logName = logName;
	}
	
	@Column(length = 30,nullable = false)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	@Column(length = 50)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	/*public String getLock() {
		return lock;
	}

	public void setLock(String lock) {
		this.lock = lock;
	}*/
//	@OneToOne(fetch = FetchType.EAGER) //这是默认值
//	@JoinColumn(name = "empId", nullable = false)
//	public Emp getEmp() {
//		return emp;
//	}
//	
//	public void setEmp(Emp emp) {
//		this.emp = emp;
//	}
	@ManyToOne(fetch = FetchType.EAGER) 
	@JoinColumn(name = "groupId", nullable = false)
	public Group getGroup() {
		return group;
	}
	
	public void setGroup(Group group) {
		this.group = group;
	}
	
	@OneToMany(mappedBy = "user",cascade = {CascadeType.ALL},
			fetch = FetchType.LAZY) 
	public List<UserRole> getUserRoles() {
		return userRoles;
	}
	
	public void setUserRoles(List<UserRole> userRoles) {
		this.userRoles = userRoles;
	}

}
