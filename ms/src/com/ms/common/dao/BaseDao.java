package com.ms.common.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.ms.common.Pager;

public interface BaseDao<T> {
	
	
	/**
	 * 保存对象接口
	 * @param t
	 */
	void save(T t);
	/**
	 * 根据唯一id删除
	 * @param id
	 */
	void deleteById(Serializable id);
	/**
	 * 在数据已存在的情况下更新
	 * @param t
	 */
	void update(T t);
	/**
	 * 根据唯一id查询
	 * @param id
	 * @return
	 */
	T getById(Serializable id);
	/**
	 * 根据某一个字段进行查询
	 * @param propertyName 字段名称
	 * @param value 条件值
	 * @return
	 */
	List<T> getByProperty(String propertyName,Object value);
	/**
	 * 根据条件查询所有满足条件的数据，无条件则查询所有的数据
	 * @param map map中key存放字段名称，value存放查询的条件 ='admin'; !='admin'； like '%admin%'
	 * @return
	 */
	List<T> getByCondition(Map<String, String> map);
	/**
	 * 根据条件分页查询数据
 	 * @param map
	 * @return
	 */
	Pager getPageByCondition(Map<String, String> map);
	/**
	 * 根据直接根据源生sql进行查询
	 * @param sql
	 * @return
	 */
	List<Object> getBySQL(String sql);
	
	
}
