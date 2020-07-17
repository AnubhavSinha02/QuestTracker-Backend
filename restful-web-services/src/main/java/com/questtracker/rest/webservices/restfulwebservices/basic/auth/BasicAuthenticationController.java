package com.questtracker.rest.webservices.restfulwebservices.basic.auth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.questtracker.rest.webservices.restfulwebservices.helloworld.AuthenticationBean;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class BasicAuthenticationController {

	@GetMapping(path="/basicauth")
	public AuthenticationBean helloWorldBean() {
		/*
		 * throw new
		 * RuntimeException("Some Error has Occured !!! Contact support at *****");
		 */		
		  return new AuthenticationBean("You are authenticated");
		 	}
	
	
}
