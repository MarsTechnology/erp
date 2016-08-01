package com.ms.rbac.service.impl;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ms.rbac.dao.RoleDao;
import com.ms.rbac.entity.Role;
import com.ms.rbac.service.RoleService;

/**
 * @author biantd 2016年7月24日
 * @describe
 */
@Service
@Transactional
public class RoelServiceImpl implements RoleService {

	@Autowired
	private RoleDao roleDaoImpl;

	/**
	 * 
	 */
	public RoelServiceImpl() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ms.rbac.service.RoleService#saveRole(com.ms.rbac.entity.Role)
	 */
	@Override
	public void saveRole(final Role role) {
		role.setCreateTime(new Date());
		role.setCreateUser("admin");
		roleDaoImpl.saveOrUpdate(role);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ms.rbac.service.RoleService#update(com.ms.rbac.entity.Role)
	 */
	@Override
	public void update(final Role role) {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ms.rbac.service.RoleService#getAll()
	 */
	@Override
	public List<Role> getAll() {

		return roleDaoImpl.getAll();
	}

	/**
	 * 
	 */
	@Override
	public Role getById(final Serializable id) {
		return roleDaoImpl.getById(id);
	}

}
