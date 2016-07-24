package com.ms.rbac.service;

import java.util.List;

import com.ms.rbac.entity.Role;

public interface RoleService {

	/**
	 * 保存角色
	 * 
	 * @param role
	 */
	void saveRole(Role role);

	/**
	 * 更新角色
	 * 
	 * @param role
	 */
	void update(Role role);

	/**
	 * 查询所有角色
	 * 
	 * @return 所有角色集合
	 */
	List<Role> getAll();

}
