package com.ms.rbac.service.impl;

import com.ms.rbac.dao.GroupDao;
import com.ms.rbac.dao.UserDao;
import com.ms.rbac.entity.Group;
import com.ms.rbac.entity.User;
import com.ms.rbac.service.GroupService;
import com.ms.rbac.service.UserService;

public class GroupServiceImpl implements GroupService{
	
	private GroupDao groupDao;
	
	public void setGroupDao(GroupDao groupDao) {
		this.groupDao = groupDao;
	}

	@Override
	public void saveGroup(Group group) {
		groupDao.save(group);
	}

	@Override
	public void updateGroup(Group group) {
		
	}

	
}
