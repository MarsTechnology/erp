package com.ms.rbac.service.impl;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ms.rbac.dao.GroupDao;
import com.ms.rbac.entity.Group;
import com.ms.rbac.service.GroupService;

@Transactional
@Service
public class GroupServiceImpl implements GroupService {

	@Autowired
	private GroupDao groupDao;

	/**
	 * 
	 */
	@Override
	public void saveGroup(final Group group) {
		group.setCreateTime(new Date());
		group.setModifyTime(new Date());
		group.setCreateUser("111");
		groupDao.saveOrUpdate(group);
	}

	/**
	 * 
	 */
	@Override
	public List<Group> getAll() {
		return groupDao.getByCondition(null);
	}

	/**
	 * 
	 */
	@Override
	public void delById(final Serializable id) {
		groupDao.deleteById(id);

	}

	/**
	 * 
	 */
	@Override
	public Group getById(final Serializable id) {
		return groupDao.getById(id);
	}

}
