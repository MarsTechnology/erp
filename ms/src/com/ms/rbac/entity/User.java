package com.ms.rbac.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.ms.common.entity.BaseEntity;

@Entity
@Table(name = "RBAC_USER")
public class User extends BaseEntity {

	private static final long serialVersionUID = 2698479255878048424L;

	// id
	 
	private Long id;
	// 用户名
	private String username;
	// 密码
	private String password;
	// 邮箱
	private String email;
	//部门
	private Group group;
	// 状态锁
	/*@Column(length = 32)
	private String lock;*/
	
	public User() {
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	@Column(length = 32)
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	@Column(length = 32)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	@Column(length = 32)
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
	@ManyToOne(fetch = FetchType.EAGER) //这是默认值
	@JoinColumn(name = "groupId", nullable = false)
	public Group getGroup() {
		return group;
	}
	
	public void setGroup(Group group) {
		this.group = group;
	}

}
