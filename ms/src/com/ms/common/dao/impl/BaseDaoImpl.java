package com.ms.common.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.ms.common.Pager;
import com.ms.common.Pagination;
import com.ms.common.dao.BaseDao;

@Resource(name = "baseDaoImpl")
public class BaseDaoImpl<T> implements BaseDao<T> {
	/**
	 * sessionFactory
	 */
	@Autowired
	private SessionFactory sessionFactory;

	/**
	 * 反射出的类
	 */
	private final Class<T> clazz;

	public BaseDaoImpl() {
		final ParameterizedType pt = (ParameterizedType) getClass()
				.getGenericSuperclass();
		this.clazz = (Class<T>) pt.getActualTypeArguments()[0];
	}

	/**
	 * 
	 * @param sessionFactory
	 */
	public void setSessionFactory(final SessionFactory sessionFactory) {
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
	public void save(final T t) {
		getCurrentSession().save(t);
	}

	/**
	 * 
	 */
	@Override
	public void deleteById(final Serializable id) {

	}

	/**
	 * 
	 */
	@Override
	public void update(final T t) {

	}

	/**
	 * 
	 */
	@Override
	public void saveOrUpdate(final T t) {
		getCurrentSession().saveOrUpdate(t);
	}

	/**
	 * 
	 */
	@Override
	public T getById(final Serializable id) {
		return (T) getCurrentSession().get(clazz, id);
	}

	/**
	 * 
	 */
	@Override
	public List<T> getByCondition(final Map<String, String> map) {
		final StringBuffer hql = new StringBuffer();
		hql.append("from");
		hql.append(clazz.getName());
		hql.append("where 1= 1");
		if (null != map) {
			for (final Map.Entry<String, String> entry : map.entrySet()) {
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
	public Pager getPageByCondition(final Map<String, String> map) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> getBySQL(final String sql) {
		return sessionFactory.getCurrentSession().createSQLQuery(sql).list();
	}

	@Override
	public List<T> getByProperty(final String propertyName, final Object value) {
		final String hql = "from " + clazz.getName() + " where " + propertyName
				+ " = ?";
		return sessionFactory.getCurrentSession().createQuery(hql)
				.setParameter(0, value).list();
	}

	@Override
	public void saveAll(final Collection<?> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll(final Collection<?> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateAll(final Collection<?> entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveOrUpdateAll(final Collection<?> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public <T> T get(final Class<T> entityClass, final Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T get(final CharSequence queryString,
			final Map<String, Object> params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T get(final CharSequence queryString, final Object... params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> List<T> findList(final CharSequence queryString,
			final Object... params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> List<T> findList(final CharSequence queryString,
			final Map<String, Object> params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> Pagination<T> findPagination(final CharSequence queryString,
			final int pageIndex, final int pageSize, final Object... params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> Pagination<T> findPagination(final CharSequence queryString,
			final Map<String, Object> params, final int pageIndex,
			final int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> Pagination<T> findPagination(final CharSequence queryString,
			final CharSequence countString, final int pageIndex,
			final int pageSize, final Object... params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> Pagination<T> findPagination(final CharSequence queryString,
			final CharSequence countString, final Map<String, Object> params,
			final int pageIndex, final int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> Pagination<T> findSqlPagination(final CharSequence queryString,
			final CharSequence countString, final Map<String, Object> params,
			final int pageIndex, final int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void executeSql(final String sql) {
		// TODO Auto-generated method stub

	}

	@Override
	public int executeSqlUpdate(final String sql) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int executeUpdate(final String hql) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public T saveEntity(final T o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T insert(final T o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(final List<T> list) {
		// TODO Auto-generated method stub

	}

	@Override
	public void insert(final List<T> list) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(final List<T> list) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(final List<T> list) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<T> findByProperty(final String name, final Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findByProperty(final Map<String, Object> conditionMap) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <V> List<V> findListByMax(final CharSequence queryString,
			final int maxResults, final Object... params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <V> List<V> findListByMax(final CharSequence queryString,
			final int maxResults, final Map<String, Object> params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findByHQL(final String hql, final Object... params) {
		final Query query = getCurrentSession().createQuery(hql);
		for (int i = 0; params != null && i < params.length; i++) {
			query.setParameter(i, params);
		}
		return query.list();
	}

}
