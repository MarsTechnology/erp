package com.ms.rbac.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.rbac.dao.GroupDao;
import com.ms.rbac.dao.UserDao;
import com.ms.rbac.entity.User;
import com.ms.rbac.service.UserService;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	@Autowired
	private GroupDao groupDao;

	public UserServiceImpl() {
	}

	@Override
	public void saveUser(final User user) {
		userDao.save(user);
	}

	@Override
	public void update(final User user) {
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
	public User getUserBylogName(final String logName) {
		final List<User> users = userDao.getByProperty("logName", logName);
		if (null != users && users.size() > 0) {
			return users.get(0);
		} else {
			return null;
		}
	}

	@Override
	public User getUserByid(final Serializable id) {
		return userDao.getById(id);
	}

}
