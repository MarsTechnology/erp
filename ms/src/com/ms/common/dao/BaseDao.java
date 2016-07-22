package com.ms.common.dao;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.ms.common.Pager;
import com.ms.common.Pagination;

public interface BaseDao<T> {

	/**
	 * 保存对象接口
	 * 
	 * @param t
	 */
	void save(T t);

	/**
	 * 根据唯一id删除
	 * 
	 * @param id
	 */
	void deleteById(Serializable id);

	/**
	 * 在数据已存在的情况下更新
	 * 
	 * @param t
	 */
	void update(T t);

	/**
	 * 
	 * 保存或更新实体, 实体没有主键时保存，否则更新
	 * 
	 * @param entity
	 *            实体对象
	 * 
	 */
	void saveOrUpdate(T t);

	/**
	 * 根据唯一id查询
	 * 
	 * @param id
	 * @return
	 */
	T getById(Serializable id);

	/**
	 * 根据某一个字段进行查询
	 * 
	 * @param propertyName
	 *            字段名称
	 * @param value
	 *            条件值
	 * @return
	 */
	List<T> getByProperty(String propertyName, Object value);

	/**
	 * 根据条件查询所有满足条件的数据，无条件则查询所有的数据
	 * 
	 * @param map
	 *            map中key存放字段名称，value存放查询的条件 ='admin'; !='admin'； like '%admin%'
	 * @return
	 */
	List<T> getByCondition(Map<String, String> map);

	/**
	 * 根据条件分页查询数据
	 * 
	 * @param map
	 * @return
	 */
	Pager getPageByCondition(Map<String, String> map);

	/**
	 * 根据直接根据源生sql进行查询
	 * 
	 * @param sql
	 * @return
	 */
	List<Object> getBySQL(String sql);

	/**
	 * 
	 * 批量保存实体
	 * 
	 * @param entities
	 *            实体集合
	 */
	void saveAll(Collection<?> entities);

	/**
	 * 
	 * 批量删除实体
	 * 
	 * @param entities
	 *            实体集合
	 * 
	 */
	void deleteAll(Collection<?> entities);

	/**
	 * 
	 * 批量更新实体
	 * 
	 * @param entities
	 *            实体集合
	 * 
	 */
	void updateAll(Collection<?> entity);

	/**
	 * 
	 * 批量保存或更新实体, 实体没有主键时保存，否则更新
	 * 
	 * @param entity
	 *            实体集合
	 * 
	 */
	void saveOrUpdateAll(Collection<?> entities);

	/**
	 * 
	 * 获取单个实体，根据实体类及实体的主键获取。
	 * 
	 * @param entityClass
	 *            实体类
	 * @param id
	 *            实体主键
	 * @return 实体对象
	 */
	<T> T get(Class<T> entityClass, Serializable id);

	/**
	 * 获取单个实体，根据查询语句及参数获取。
	 * 
	 * @param queryString
	 *            查询语句
	 * @param params
	 *            可选的查询参数
	 * @return 单个实体，如果查询结果有多个，则返回第一个实体
	 */
	<T> T get(CharSequence queryString, Map<String, Object> params);

	/**
	 * 获取单个实体，根据查询语句及参数获取。
	 * 
	 * @param queryString
	 *            查询语句
	 * @param params
	 *            可选的查询参数
	 * @return 单个实体，如果查询结果有多个，则返回第一个实体
	 */
	<T> T get(CharSequence queryString, Object... params);

	/**
	 * 
	 * 查询实体列表
	 * 
	 * @param queryString
	 *            查询语句
	 * @param params
	 *            可选的查询参数
	 * @return 实体列表
	 */
	<T> List<T> findList(CharSequence queryString, Object... params);

	/**
	 * 
	 * 查询实体列表
	 * 
	 * @param queryString
	 *            查询语句
	 * @param params
	 *            可选的查询参数
	 * @return 实体列表
	 */
	<T> List<T> findList(CharSequence queryString, Map<String, Object> params);

	/**
	 * 分页查询实体
	 * 
	 * @param queryString
	 *            查询语句
	 * @param pageIndex
	 *            当前页码，如果pageIndex<1则不分页，且返回pageSize条记录。
	 * @param pageSize
	 *            每页记录数，如果pageSize<1则返回所有记录。
	 * @param params
	 *            可选的查询参数
	 * @return 实体分页对象
	 */
	<T> Pagination<T> findPagination(CharSequence queryString, int pageIndex,
			int pageSize, Object... params);

	/**
	 * 分页查询实体
	 * 
	 * @param queryString
	 *            查询语句
	 * @param params
	 *            可选的查询参数
	 * @param pageIndex
	 *            当前页码，如果pageIndex<2则不分页，且返回pageSize条记录。
	 * @param pageSize
	 *            每页记录数，如果pageSize<1则返回所有记录。
	 * 
	 * @return 实体分页对象
	 */
	<T> Pagination<T> findPagination(CharSequence queryString,
			Map<String, Object> params, int pageIndex, int pageSize);

	/**
	 * 分页查询实体，自定义总条数查询语句，适合复杂的hql分页查询
	 * 
	 * @param queryString
	 *            查询语句
	 * @param countString
	 *            查询记录总条数语句
	 * @param pageIndex
	 *            当前页码，如果pageIndex<1则不分页，且返回pageSize条记录。
	 * @param pageSize
	 *            每页记录数，如果pageSize<1则返回所有记录。
	 * @param params
	 *            可选的查询参数
	 * @return 实体分页对象
	 */
	<T> Pagination<T> findPagination(CharSequence queryString,
			CharSequence countString, int pageIndex, int pageSize,
			Object... params);

	/**
	 * 分页查询实体，自定义总条数查询语句，适合复杂的hql分页查询
	 * 
	 * @param queryString
	 *            查询语句
	 * @param countString
	 *            查询记录总条数语句
	 * @param params
	 *            可选的查询参数
	 * @param pageIndex
	 *            当前页码，如果pageIndex<2则不分页，且返回pageSize条记录。
	 * @param pageSize
	 *            每页记录数，如果pageSize<1则返回所有记录。
	 * 
	 * @return 实体分页对象
	 */
	<T> Pagination<T> findPagination(CharSequence queryString,
			CharSequence countString, Map<String, Object> params,
			int pageIndex, int pageSize);

	/**
	 * 分页查询实体，自定义总条数查询语句，适合复杂的sql分页查询
	 * 
	 * @param queryString
	 *            查询语句
	 * @param countString
	 *            查询记录总条数语句
	 * @param params
	 *            可选的查询参数
	 * @param pageIndex
	 *            当前页码，如果pageIndex<2则不分页，且返回pageSize条记录。
	 * @param pageSize
	 *            每页记录数，如果pageSize<1则返回所有记录。
	 * 
	 * @return 实体分页对象
	 */
	public <T> Pagination<T> findSqlPagination(final CharSequence queryString,
			final CharSequence countString, final Map<String, Object> params,
			int pageIndex, int pageSize);

	/**
	 * 执行数据库更新操作
	 * 
	 * @deprecated 用{@link #executeSqlUpdate(String)}替换
	 * @param sql
	 */
	@Deprecated
	void executeSql(String sql);

	/**
	 * 执行数据库更新操作
	 * 
	 * @param sql
	 * @return 更新的记录条数
	 */
	int executeSqlUpdate(String sql);

	/**
	 * 执行数据库更新操作
	 * 
	 * @param hql
	 * @return 更新的记录条数
	 */
	int executeUpdate(String hql);

	public T saveEntity(T o);

	public T insert(T o);

	public void save(List<T> list);

	public void insert(List<T> list);

	public void delete(List<T> list);

	public void update(List<T> list);

	public List<T> findByProperty(String name, Object value);

	public List<T> findByProperty(Map<String, Object> conditionMap);

	/**
	 * 
	 * 查询实体列表
	 * 
	 * @param queryString
	 *            查询语句
	 * @param maxResults
	 *            列表最大数
	 * @param params
	 *            可选的查询参数
	 * @return 实体列表
	 */
	public <V> List<V> findListByMax(CharSequence queryString, int maxResults,
			Object... params);

	/**
	 * 
	 * 查询实体列表
	 * 
	 * @param queryString
	 *            查询语句
	 * @param maxResults
	 *            列表最大数
	 * @param params
	 *            可选的查询参数
	 * @return 实体列表
	 */
	public <V> List<V> findListByMax(CharSequence queryString, int maxResults,
			Map<String, Object> params);

	/**
	 * 根据hql 和传入条件查询
	 * 
	 * @param hql
	 * @param params
	 * @return
	 */
	public List<T> findByHQL(String hql, Object... params);

}
