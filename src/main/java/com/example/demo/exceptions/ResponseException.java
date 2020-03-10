package com.example.demo.exceptions;

public class ResponseException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ResponseException(String errorMessage, String description) {
		super();
		this.errorMessage = errorMessage;
		this.description = description;
	}
	private String errorMessage;
	private String description;
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public ResponseException() {}

}
