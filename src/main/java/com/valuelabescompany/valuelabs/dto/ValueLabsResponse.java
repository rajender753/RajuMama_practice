package com.valuelabescompany.valuelabs.dto;

public class ValueLabsResponse {

	private Integer status;

	// To give user message ex: Employee saved successfully or Employee not saved
	private String message;

	private Object responseBody;

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getResponseBody() {
		return responseBody;
	}

	public void setResponseBody(Object responseBody) {
		this.responseBody = responseBody;
	}

}
