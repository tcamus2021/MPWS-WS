package com.mpws.ws.mpwsws.bo;

/**
 * 
 * @author tanguycamus
 *
 * @param <T>
 */
public class OutputServicesObject<T> {
	private T body;
	private String errorMessage;
	
	/**
	 * Getter body
	 * @return
	 */
	public T getBody() { 
		return this.body; 
	}
	
	/**
	 * Setter body
	 * @param body
	 */
	public void setBody(T body) {
		this.body = body;
	}
	
	/**
	 * Getter errorMessage
	 * @return
	 */
	public String getErrorMessage() { 
		return this.errorMessage; 
	}
	
	/**
	 * Setter errorMessage
	 * @param errorMessage
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
