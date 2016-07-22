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

import lombok.Data;
import lombok.EqualsAndHashCode;

import com.ms.common.entity.BaseEntity;

@Entity
@Table(name = "RBAC_USER")
@Data
@EqualsAndHashCode(callSuper = false)
public class User extends BaseEntity {

	private static final long serialVersionUID = 2698479255878048424L;
	/**
	 * 登录名称
	 */
	@Column(length = 50, nullable = false)
	private String logName;
	/**
	 * 登录密码
	 */
	@Column(length = 30, nullable = false)
	private String password;
	/**
	 * 电子邮箱
	 */
	@Column(length = 50)
	private String email;
	/**
	 * 用户部门
	 */
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "groupId", nullable = false)
	private Group group;

	/**
	 * 用户角色
	 */
	@OneToMany(mappedBy = "user", cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
	private List<UserRole> userRoles;

	public String getLogName() {
		return logName;
	}

	public void setLogName(final String logName) {
		this.logName = logName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(final String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(final Group group) {
		this.group = group;
	}

	public List<UserRole> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(final List<UserRole> userRoles) {
		this.userRoles = userRoles;
	}

}
