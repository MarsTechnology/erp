package com.ms.rbac.service;

import com.ms.rbac.entity.Group;
import com.ms.rbac.entity.User;

public interface GroupService {

	/**
	 * ����һ������
	 * @param group
	 */
	void saveGroup(Group group);
	/**
	 * ���²�����Ϣ
	 * @param group
	 */
	void updateGroup(Group group);
	
	
}
