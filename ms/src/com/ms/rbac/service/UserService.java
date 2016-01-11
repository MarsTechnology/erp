package com.ms.rbac.service;

import com.ms.rbac.entity.User;

public interface UserService {

	/**
	 * �û����������У��
	 * @param user
	 * @return
	 */
	Boolean getUser(User user);
	/**
	 * ����һ���û�
	 * @param user
	 */
	void saveUser(User user);
	/**
	 * �����û�����
	 * @param user
	 */
	void update(User user);
	/**
	 * �����û���ʼ������
	 */
	void initAddUser();
	
	
}
