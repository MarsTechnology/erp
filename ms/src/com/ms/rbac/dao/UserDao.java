package com.ms.rbac.dao;

import com.ms.common.dao.BaseDao;
import com.ms.rbac.entity.User;

public interface UserDao extends BaseDao<User> {
	/**
	 * 根据用户名和密码查询
	 * @param user
	 * @return
	 */
	User getUser(User user);

}
