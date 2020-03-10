/**
 * 
 */
package com.example.demo.exceptions;

/**
 * @author admin
 *
 */
public class UserNotFoundException extends Exception {
	
	public UserNotFoundException(String errorMessage) {
		super(errorMessage);
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*private String errorMessage;
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
	}*/

}
