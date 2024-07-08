package com.csp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MyController {
	
	@Value("${my.greetings}")
	private String greetings;
	@Value("${my.age}")
	private int age;
	@Value("${my.name}")
	private String name;

	@GetMapping("/msg")
	public String getDetails() {
		return greetings+" "+name+" "+", Your age is "+age;
	}
}
