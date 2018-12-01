package com.tejio.oj.nubee.authorization.exception;

import java.util.Map;

import org.springframework.http.HttpStatus;

public class NubeeApplicationException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1884898011956416758L;

	private HttpStatus responseStatus;
	private String errorMessage;
	private String errorCode;
	private Exception exception;
	private Map<String, Object> metadata;

	public NubeeApplicationException(HttpStatus responseStatus, String errorMessage, String errorCode,
			Exception exception, Map<String, Object> metadata) {
		super();
		this.responseStatus = responseStatus;
		this.errorMessage = errorMessage;
		this.errorCode = errorCode;
		this.exception = exception;
		this.metadata = metadata;
	}

	public HttpStatus getResponseStatus() {
		return responseStatus;
	}

	public void setResponseStatus(HttpStatus responseStatus) {
		this.responseStatus = responseStatus;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Exception getException() {
		return exception;
	}

	public void setException(Exception exception) {
		this.exception = exception;
	}

	public Map<String, Object> getMetadata() {
		return metadata;
	}

	public void setMetadata(Map<String, Object> metadata) {
		this.metadata = metadata;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
