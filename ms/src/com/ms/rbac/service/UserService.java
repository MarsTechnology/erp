package com.ms.rbac.service;

import com.ms.rbac.entity.User;

public interface UserService {

	//�û����������У��
	Boolean getUser(User user);
	//����һ���û�
	void saveUser(User user);
	//�����û�����
	void update(User user);
	
	
}
