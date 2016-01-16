package com.ms.common.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.ms.common.Pager;

public interface BaseDao<T> {
	
	
	/**
	 * 保存对象
	 * @param t
	 */
	void save(T t);
	/**
	 * 根据id删除
	 * @param id
	 */
	void deleteById(Serializable id);
	/**
	 * 更新
	 * @param t
	 */
	void update(T t);
	/**
	 * 根据ID查询对象
	 * @param id
	 * @return
	 */
	T getById(Serializable id);
	/**
	 * 根据条件查询出所有
	 * @param map
	 * @return
	 */
	List<T> getAllByCondition(Map<String, String> map);
	/**
	 * 根据条件查询分页结果
	 * @param map
	 * @return
	 */
	Pager getPageByCondition(Map<String, String> map);
	/**
	 * 无条件查询出所有数据
	 * @return
	 */
	List<T> getAll();
	
}
