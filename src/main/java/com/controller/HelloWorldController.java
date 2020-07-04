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
		
		return "Hello World with Jenkins with Webhook and Pipeline v1.0 fro all branch and pipeline and debug";
	}
}
