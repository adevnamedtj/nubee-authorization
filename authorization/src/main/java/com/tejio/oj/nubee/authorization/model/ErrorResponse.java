package com.tejio.oj.nubee.authorization.model;

import java.time.LocalDateTime;

public class ErrorResponse {

	private String message;
	private String code;
	private LocalDateTime date;

	public ErrorResponse(String message, String code, LocalDateTime date) {
		super();
		this.message = message;
		this.code = code;
		this.date = date;
	}

	public ErrorResponse(String message, String code) {
		super();
		this.message = message;
		this.code = code;
		this.date = LocalDateTime.now();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	
}
