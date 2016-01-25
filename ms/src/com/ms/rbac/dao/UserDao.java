package com.ms.rbac.dao;

import org.springframework.stereotype.Repository;

import com.ms.common.dao.BaseDao;
import com.ms.rbac.entity.User;


public interface UserDao extends BaseDao<User> {
	/**
	 * ����û���������ѯ
	 * @param user
	 * @return
	 */
	User getUser(User user);

}
