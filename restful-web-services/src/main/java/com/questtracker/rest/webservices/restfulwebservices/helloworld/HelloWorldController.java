package com.questtracker.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.questtracker.rest.webservices.restfulwebservices.helloworld.AuthenticationBean;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class HelloWorldController {

	@GetMapping(path="/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
	
	@GetMapping(path="/hello-world-bean")
	public AuthenticationBean helloWorldBean() {
		/*
		 * throw new
		 * RuntimeException("Some Error has Occured !!! Contact support at *****");
		 */		
		  return new AuthenticationBean("Hi Anubhav !!! Welcome to your Angular App");
		 	}
	
	@GetMapping(path="/hello-world/path-variable/{name}")
	public AuthenticationBean helloWorldPathVariable(@PathVariable String name) {
		return new AuthenticationBean(String.format("Hello World, %s", name));
	}
}
