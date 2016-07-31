package com.ms.common.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 
 * @author biantd 2016年7月25日
 * @describe 自定义主键或者联合主键继承该类
 */
@MappedSuperclass
public class BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4295426802999880307L;

	/**
	 * 每条数据的创建时间
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date createTime;
	/**
	 * 数据在做更新操作时的时间
	 */

	@Temporal(TemporalType.TIMESTAMP)
	private Date modifyTime;
	/**
	 * 数据创建人
	 */
	@Column(length = 32, nullable = false)
	private String createUser;

	public BaseEntity() {

	}

	public BaseEntity(final Date createTime, final Date modifyTime,
			final String createUser) {
		super();

		this.createTime = createTime;
		this.modifyTime = modifyTime;
		this.createUser = createUser;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(final Date createTime) {
		this.createTime = createTime;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(final Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(final String createUser) {
		this.createUser = createUser;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result
				+ ((createUser == null) ? 0 : createUser.hashCode());
		result = prime * result
				+ ((modifyTime == null) ? 0 : modifyTime.hashCode());
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final BaseEntity other = (BaseEntity) obj;
		if (createTime == null) {
			if (other.createTime != null)
				return false;
		} else if (!createTime.equals(other.createTime))
			return false;
		if (createUser == null) {
			if (other.createUser != null)
				return false;
		} else if (!createUser.equals(other.createUser))
			return false;
		if (modifyTime == null) {
			if (other.modifyTime != null)
				return false;
		} else if (!modifyTime.equals(other.modifyTime))
			return false;
		return true;
	}

	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("BaseEntity [createTime=");
		builder.append(createTime);
		builder.append(", modifyTime=");
		builder.append(modifyTime);
		builder.append(", createUser=");
		builder.append(createUser);
		builder.append("]");
		return builder.toString();
	}

}
