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
	// 
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

	/**
	 * 
	 */
	@Override
	public List<T> getByCondition(Map<String, String> map) {
		StringBuffer hql = new StringBuffer();
		hql.append("from");
		hql.append(clazz.getName());
		hql.append("where 1= 1");
		if (null != map) {
			for (Map.Entry<String, String> entry :map.entrySet()) {
				hql.append(" and ");
				hql.append(entry.getKey());
				hql.append(entry.getValue());
			}
		}
		return sessionFactory.getCurrentSession()
				.createQuery("from "+clazz.getName()).list();
	}

	@Override
	public Pager getPageByCondition(Map<String, String> map) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> getBySQL(String sql) {
		return sessionFactory.getCurrentSession().createSQLQuery(sql).list();
	}

	@Override
	public List<T> getByProperty(String propertyName, Object value) {
		String hql = "from "+clazz.getName()+" where "+propertyName+" = ?";
		return sessionFactory.getCurrentSession().createQuery(hql)
					.setParameter(0, value)
					.list();
	}

}
