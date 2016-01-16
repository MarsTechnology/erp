package com.ms.rbac.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.ms.rbac.dao.GroupDao;
import com.ms.rbac.dao.UserDao;
import com.ms.rbac.entity.User;
import com.ms.rbac.service.UserService;

public class UserServiceImpl implements UserService{
	
	private UserDao userDao;
	@Autowired
	private GroupDao groupDao;
	
	public UserServiceImpl() {
	}
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public void setGroupDao(GroupDao groupDao) {
		this.groupDao = groupDao;
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
	/**
	 * 增加用户初始化
	 */
	@Override
	public void initAddUser() {
		//查询出系统中现有的部门
		groupDao.getAll();
		
	}

}
