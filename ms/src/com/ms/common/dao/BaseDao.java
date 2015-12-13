package com.ms.common.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.ms.common.Pager;

public interface BaseDao<T> {
	//保存对象
	void save(T t);
	//根据id删除
	void deleteById(Serializable id);
	//更新
	void update(T t);
	//根据ID查询对象
	T getById(Serializable id);
	//根据条件查询出所有
	List<T> getAllByCondition(Map<String, String> map);
	//根据条件查询分页结果
	Pager getPageByCondition(Map<String, String> map);
	
}
