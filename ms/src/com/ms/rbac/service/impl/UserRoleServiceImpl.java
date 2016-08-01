package com.ms.rbac.service.impl;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ms.rbac.dao.UserRoleDao;
import com.ms.rbac.entity.Role;
import com.ms.rbac.entity.User;
import com.ms.rbac.entity.UserRole;
import com.ms.rbac.service.RoleService;
import com.ms.rbac.service.UserRoleService;
import com.ms.rbac.service.UserService;

/**
 * @author biantd 2016年7月24日
 * @describe
 */
@Service
@Transactional
public class UserRoleServiceImpl implements UserRoleService {

	@Autowired
	private UserRoleDao userRoleDaoImpl;
	@Autowired
	private UserService userServiceImpl;
	@Autowired
	private RoleService roleServiceImpl;

	/**
	 * 
	 */
	public UserRoleServiceImpl() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ms.rbac.service.UserRoleService#getUserRoleView()
	 */
	@Override
	public Map<String, Object> getUserRoleView() {
		final Map<String, Object> map = new HashMap<String, Object>();

		final List<User> users = userServiceImpl.getAllUser();

		final List<Role> roles = roleServiceImpl.getAll();

		map.put("userList", users);
		map.put("roleList", roles);
		// final List<UserRole> userRoles = userRoleDaoImpl.getAll();
		// map.put("userRoleList", userRoles);
		return map;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.ms.rbac.service.UserRoleService#saveUserRole(com.ms.rbac.entity.User,
	 * java.util.List)
	 */
	@Override
	public void saveUserRole(final String userId, final String roleIds) {

		final User user = userServiceImpl.getUserByid(userId);

		if (StringUtils.isNotEmpty(roleIds)) {

			final String[] roleIdArr = roleIds.split(",");

			for (int i = 0; i < roleIdArr.length; i++) {
				final UserRole userRole = new UserRole();

				userRole.setUser(user);
				userRole.setRole(roleServiceImpl.getById(roleIdArr[i]));
				userRole.setCreateTime(new Date());
				userRole.setCreateUser("admin");

				userRoleDaoImpl.save(userRole);

			}

		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.ms.rbac.service.UserRoleService#delUserRoleByUserId(java.io.Serializable
	 * )
	 */
	@Override
	public void delUserRoleByUserId(final Serializable userId) {

		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ms.rbac.service.UserRoleService#grantUserRole()
	 */
	@Override
	public void grantUserRole(final String userId, final String roleIds) {
		delUserRoleByUserId(userId);
		saveUserRole(userId, roleIds);

	}

}
