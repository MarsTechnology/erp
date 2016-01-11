package com.ms.common.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Map;

import org.hibernate.SessionFactory;

import com.ms.common.Pager;
import com.ms.common.dao.BaseDao;

public class BaseDaoImpl<T> implements BaseDao<T> {
	// sessionFactory
	private SessionFactory sessionFactory;
	// 反射类对象
	private Class<T> clazz;

	public BaseDaoImpl() {
		ParameterizedType pt = (ParameterizedType) getClass()
				.getGenericSuperclass();
		this.clazz = (Class<T>) pt.getActualTypeArguments()[0];
	}

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

	@Override
	public List<T> getAll() {
		return sessionFactory.getCurrentSession()
				.createQuery("from "+clazz.getName()).list();
	}

}
