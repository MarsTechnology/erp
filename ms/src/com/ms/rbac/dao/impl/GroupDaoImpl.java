package com.ms.rbac.dao.impl;

import org.springframework.stereotype.Repository;

import com.ms.common.dao.impl.BaseDaoImpl;
import com.ms.rbac.dao.GroupDao;
import com.ms.rbac.dao.UserDao;
import com.ms.rbac.entity.Group;
import com.ms.rbac.entity.User;

@Repository
public class GroupDaoImpl extends BaseDaoImpl<Group> implements GroupDao {

}
