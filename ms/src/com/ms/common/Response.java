package com.ms.common;

import java.util.List;

import com.ms.common.enums.Status;

public class Response {

	private Enum<Status> status;
	private String message;
	private List<Object> result;

	
	public Enum<Status> getStatus() {
		return status;
	}

	public void setStatus(Enum<Status> status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<Object> getResult() {
		return result;
	}

	public void setResult(List<Object> result) {
		this.result = result;
	}

}
