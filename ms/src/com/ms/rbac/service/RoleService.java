package com.ms.rbac.service;

import java.io.Serializable;
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

	/**
	 * 根据id查询角色
	 * 
	 * @param id
	 *            角色id
	 * @return 角色对象
	 */
	Role getById(Serializable id);

}
