package com.ms.rbac.service;

import com.ms.rbac.entity.Group;
import com.ms.rbac.entity.User;

public interface GroupService {

	/**
	 * 保存一个部门
	 * @param group
	 */
	void saveGroup(Group group);
	/**
	 * 更新部门信息
	 * @param group
	 */
	void updateGroup(Group group);
	
	
}
