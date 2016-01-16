package com.ms.rbac.service;

import com.ms.rbac.entity.User;

public interface UserService {

	/**
	 * 用户名和密码的校验
	 * @param user
	 * @return
	 */
	Boolean getUser(User user);
	/**
	 * 保存一个用户
	 * @param user
	 */
	void saveUser(User user);
	/**
	 * 更新用户资料
	 * @param user
	 */
	void update(User user);
	/**
	 * 增加用户初始化方法
	 */
	void initAddUser();
	
	
}
