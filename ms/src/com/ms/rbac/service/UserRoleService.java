package com.ms.rbac.service;

import java.io.Serializable;
import java.util.Map;

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
	void saveUserRole(String userId, String roleIds);

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
	void grantUserRole(final String userId, final String roleIds);

}
