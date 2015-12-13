package com.ms.common.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.ms.common.Pager;

public interface BaseDao<T> {
	//�������
	void save(T t);
	//����idɾ��
	void deleteById(Serializable id);
	//����
	void update(T t);
	//����ID��ѯ����
	T getById(Serializable id);
	//����������ѯ������
	List<T> getAllByCondition(Map<String, String> map);
	//����������ѯ��ҳ���
	Pager getPageByCondition(Map<String, String> map);
	
}
