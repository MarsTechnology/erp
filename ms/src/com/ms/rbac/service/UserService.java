package com.ms.rbac.service;

import com.ms.rbac.entity.User;

public interface UserService {

	//用户名和密码的校验
	Boolean getUser(User user);
	//保存一个用户
	void saveUser(User user);
	//更新用户资料
	void update(User user);
	
	
}
