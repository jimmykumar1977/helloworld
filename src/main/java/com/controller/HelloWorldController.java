package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorldController {

	// hello
	@GetMapping
	public String hello() {
		// new changes jimmy
		// local changes master
		return "Hello World";
	}
}
