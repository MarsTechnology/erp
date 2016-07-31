package com.ms.rbac.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.ms.rbac.entity.Role;
import com.ms.rbac.entity.User;

/**
 * @author biantd 2016年7月24日
 * @describe
 */
public interface UserRoleService {
	/**
	 * 查询用户角色视图
	 * 
	 * @return 用户角色视图
	 */
	Map<String, Object> getUserRoleView();

	/**
	 * 保存用户角色
	 * 
	 * @param user
	 * @param roles
	 */
	void saveUserRole(User user, List<Role> roles);

	/**
	 * 根据用户id 删除用户角色
	 * 
	 * @param userId
	 *            用户id
	 */
	void delUserRoleByUserId(Serializable userId);

	/**
	 * 对用户赋予角色
	 */
	void grantUserRole(User user, List<Role> roles);

}
