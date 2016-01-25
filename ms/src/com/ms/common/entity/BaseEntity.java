package com.ms.common.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
@MappedSuperclass
public class BaseEntity implements Serializable{

	/**
	 * ʵ����ĸ���
	 */
	private static final long serialVersionUID = -4295426802999880307L;
	/**
	 * id 采用uuid生成方式
	 */
	private String  id;
	/**
	 * 每条数据的创建时间
	 */
	private Date createTime;
	/**
	 * 数据在做更新操作时的时间
	 */
	private Date modifyTime;
	/**
	 * 数据创建人
	 */
	private String createUser;
	
	public BaseEntity() {
		this.modifyTime = new Date();
	}
	
	@Id
	@Column(length = 32)
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid") 
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	@Temporal(TemporalType.TIMESTAMP) 
	@Column(nullable = false)
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	@Temporal(TemporalType.TIMESTAMP)
	public Date getModifyTime() {
		return modifyTime;
	}
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
	@Column(length = 32,nullable = false)
	public String getCreateUser() {
		return createUser;
	}
	
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
}
