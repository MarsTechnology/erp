package com.ms.common.entity;

import java.io.Serializable;

import javax.persistence.Column;

public class BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4295426802999880307L;
	//创建时间
	private String createTime;
	//最后修改时间
	private String modifyTime;
	//创建人
	private String createId;
	public BaseEntity() {
		super();
	}
	
	@Column(length = 32)
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	@Column(length = 32)
	public String getModifyTime() {
		return modifyTime;
	}
	public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
	}
	@Column(length = 32)
	public String getCreateId() {
		return createId;
	}
	public void setCreateId(String createId) {
		this.createId = createId;
	}
}
