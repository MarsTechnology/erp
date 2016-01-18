package com.ms.rbac.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	public void saveUser(User user) {
		this.userDao.save(user);
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}
	/**
	 * 
	 */
	@Override
	public void initAddUser() {
		groupDao.getByCondition(null);
		
	}

	/**
	 * 
	 */
	@Override
	public User getUserBylogName(String logName) {
		List<User> users = userDao.getByProperty("logName", logName);
		if (null != users && users.size() > 0) {
			return users.get(0);
		}else {
			return null;
		}
	}

}
