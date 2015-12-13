package com.ms.common.dao.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.hibernate.SessionFactory;

import com.ms.common.Pager;
import com.ms.common.dao.BaseDao;

public class BaseDaoImpl<T> implements BaseDao<T>{
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void save(T t) {
		sessionFactory.getCurrentSession().save(t);
	}

	@Override
	public void deleteById(Serializable id) {
		
	}

	@Override
	public void update(T t) {
		
	}

	@Override
	public T getById(Serializable id) {
		return null;
	}

	@Override
	public List<T> getAllByCondition(Map<String, String> map) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pager getPageByCondition(Map<String, String> map) {
		// TODO Auto-generated method stub
		return null;
	}

}
