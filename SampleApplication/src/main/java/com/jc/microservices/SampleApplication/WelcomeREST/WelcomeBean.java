package com.jc.microservices.SampleApplication.WelcomeREST;

public class WelcomeBean {
	private String message;

	/**
	 * @param message
	 */
	public WelcomeBean(String message) {
		super();
		this.message = message;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

}
