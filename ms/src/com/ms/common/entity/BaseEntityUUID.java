package com.ms.common.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;

/**
 * 
 * @author biantd 2016年7月25日
 * @describe 采用uuid表继承该类
 */
@MappedSuperclass
public class BaseEntityUUID extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3793847187370381304L;
	/**
	 * id 采用uuid生成方式
	 */
	@Id
	@Column(length = 32)
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid")
	private String id;

	public BaseEntityUUID() {

	}

	public BaseEntityUUID(final String id) {
		super();
		this.id = id;

	}

	public String getId() {
		return id;
	}

	public void setId(final String id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		final BaseEntityUUID other = (BaseEntityUUID) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("BaseEntityUUID [id=");
		builder.append(id);
		builder.append("]");
		return builder.toString();
	}

}
