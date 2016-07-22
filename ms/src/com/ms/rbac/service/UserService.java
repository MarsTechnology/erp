package com.ms.rbac.service;

import java.io.Serializable;

import com.ms.rbac.entity.User;

public interface UserService {

	/**
	 * 保存用户
	 * 
	 * @param user
	 */
	void saveUser(User user);

	/**
	 * 更新用户
	 * 
	 * @param user
	 */
	void update(User user);

	/**
	 * 初始化添加用户
	 */
	void initAddUser();

	/**
	 * 根据用户名获得用户对象
	 * 
	 * @param logName
	 * @return
	 */
	User getUserBylogName(String logName);

	/**
	 * 根据id获取用户对象
	 * 
	 * @param id
	 * @return
	 */
	User getUserByid(Serializable id);

}
