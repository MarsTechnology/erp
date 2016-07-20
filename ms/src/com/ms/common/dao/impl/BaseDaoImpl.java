package com.ms.common.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.ms.common.Pager;
import com.ms.common.Pagination;
import com.ms.common.dao.BaseDao;

public class BaseDaoImpl<T> implements BaseDao<T> {
	// sessionFactory
	@Autowired
	private SessionFactory sessionFactory;

	/**
	 * 反射出的类
	 */
	private final Class<T> clazz;

	public BaseDaoImpl() {
		ParameterizedType pt = (ParameterizedType) getClass()
				.getGenericSuperclass();
		this.clazz = (Class<T>) pt.getActualTypeArguments()[0];
	}

	/**
	 * 
	 * @param sessionFactory
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	/**
	 * 
	 * @return
	 */
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	/**
	 * 
	 */
	@Override
	public void save(T t) {
		getCurrentSession().save(t);
	}

	/**
	 * 
	 */
	@Override
	public void deleteById(Serializable id) {

	}

	/**
	 * 
	 */
	@Override
	public void update(T t) {

	}

	/**
	 * 
	 */
	@Override
	public void saveOrUpdate(T t) {
		getCurrentSession().saveOrUpdate(t);
	}

	/**
	 * 
	 */
	@Override
	public T getById(Serializable id) {
		return (T) getCurrentSession().get(clazz, id);
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
			for (Map.Entry<String, String> entry : map.entrySet()) {
				hql.append(" and ");
				hql.append(entry.getKey());
				hql.append(entry.getValue());
			}
		}
		return sessionFactory.getCurrentSession()
				.createQuery("from " + clazz.getName()).list();
	}

	/**
	 * 
	 */
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
		String hql = "from " + clazz.getName() + " where " + propertyName
				+ " = ?";
		return sessionFactory.getCurrentSession().createQuery(hql)
				.setParameter(0, value).list();
	}

	@Override
	public void saveAll(Collection<?> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll(Collection<?> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateAll(Collection<?> entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveOrUpdateAll(Collection<?> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public <T> T get(Class<T> entityClass, Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T get(CharSequence queryString, Map<String, Object> params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T get(CharSequence queryString, Object... params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> List<T> findList(CharSequence queryString, Object... params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> List<T> findList(CharSequence queryString,
			Map<String, Object> params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> Pagination<T> findPagination(CharSequence queryString,
			int pageIndex, int pageSize, Object... params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> Pagination<T> findPagination(CharSequence queryString,
			Map<String, Object> params, int pageIndex, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> Pagination<T> findPagination(CharSequence queryString,
			CharSequence countString, int pageIndex, int pageSize,
			Object... params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> Pagination<T> findPagination(CharSequence queryString,
			CharSequence countString, Map<String, Object> params,
			int pageIndex, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> Pagination<T> findSqlPagination(CharSequence queryString,
			CharSequence countString, Map<String, Object> params,
			int pageIndex, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void executeSql(String sql) {
		// TODO Auto-generated method stub

	}

	@Override
	public int executeSqlUpdate(String sql) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int executeUpdate(String hql) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public T saveEntity(T o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T insert(T o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(List<T> list) {
		// TODO Auto-generated method stub

	}

	@Override
	public void insert(List<T> list) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(List<T> list) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(List<T> list) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<T> findByProperty(String name, Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findByProperty(Map<String, Object> conditionMap) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <V> List<V> findListByMax(CharSequence queryString, int maxResults,
			Object... params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <V> List<V> findListByMax(CharSequence queryString, int maxResults,
			Map<String, Object> params) {
		// TODO Auto-generated method stub
		return null;
	}

}
