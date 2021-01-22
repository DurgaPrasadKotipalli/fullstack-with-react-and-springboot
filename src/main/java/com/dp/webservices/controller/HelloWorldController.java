package com.dp.webservices.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dp.webservices.model.HelloWorldBean;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class HelloWorldController {
	
	@GetMapping("/basicAuth")
	public HelloWorldBean helloWorld() {
		return new HelloWorldBean("You are authenticated");
	}

	
	@GetMapping("/hello-path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) throws Exception {
		//throw new RuntimeException("Something went wrong");
		return new HelloWorldBean(String.format("Hello World222, %s",name));
	}

}
