package com.ms.common.enume;

public enum Status {

	SUCCESS("Success", 0),
	FAIL("Fail", 1),
	
	INPROGRESS("In-Progress", 2),
	COMPLETE("Complete", 3),
	REFUSED("Refused", 4),
	EXPIRED("Expired", 5);

	private String name;
	private int code;

	private Status(String name, int code) {
		this.name = name;
		this.code = code;
	}

	public static String getName(int code) {
		for (Status c : Status.values()) {
			if (c.getCode() == code) {
				return c.name;
			}
		}
		return null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

}
