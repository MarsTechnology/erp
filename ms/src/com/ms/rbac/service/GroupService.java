package com.ms.rbac.service;

import java.io.Serializable;
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

	/**
	 * 根据id删除部门
	 * 
	 * @param id
	 *            部门id
	 */
	void delById(Serializable id);

	/**
	 * 根据id获取部门对象
	 * 
	 * @param id
	 *            部门id
	 * @return 部门对象
	 */
	Group getById(Serializable id);

}
