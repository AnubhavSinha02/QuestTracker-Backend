package com.questtracker.rest.webservices.restfulwebservices.helloworld;

public class AuthenticationBean {
	
	private String message;

	public AuthenticationBean(String message) {
		// TODO Auto-generated constructor stub
		this.message=message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + "]";
	}
	
	

}
