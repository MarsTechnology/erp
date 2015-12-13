package com.ms.rbac.service.impl;

import com.ms.rbac.dao.UserDao;
import com.ms.rbac.entity.User;
import com.ms.rbac.service.UserService;

public class UserServiceImpl implements UserService{
	
	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public Boolean getUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveUser(User user) {
		this.userDao.save(user);
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

}
