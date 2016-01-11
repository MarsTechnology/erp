package com.ms.common.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.ms.common.Pager;

public interface BaseDao<T> {
	
	
	/**
	 * �������
	 * @param t
	 */
	void save(T t);
	/**
	 * ����idɾ��
	 * @param id
	 */
	void deleteById(Serializable id);
	/**
	 * ����
	 * @param t
	 */
	void update(T t);
	/**
	 * ����ID��ѯ����
	 * @param id
	 * @return
	 */
	T getById(Serializable id);
	/**
	 * ����������ѯ������
	 * @param map
	 * @return
	 */
	List<T> getAllByCondition(Map<String, String> map);
	/**
	 * ����������ѯ��ҳ���
	 * @param map
	 * @return
	 */
	Pager getPageByCondition(Map<String, String> map);
	/**
	 * ��������ѯ����������
	 * @return
	 */
	List<T> getAll();
	
}
