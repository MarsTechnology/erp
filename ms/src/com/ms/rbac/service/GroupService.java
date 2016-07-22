package com.ms.rbac.service;

import java.util.List;

import com.ms.rbac.entity.Group;

public interface GroupService {

	/**
	 * 保存部门
	 * 
	 * @param group
	 */
	void saveGroup(Group group);

	/**
	 * 获取所有部门
	 * 
	 * @return
	 */
	List<Group> getAll();

}
