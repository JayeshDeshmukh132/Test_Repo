package com.aurionpro.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app/teacher")
public class TeacherController {
	

	@GetMapping
	public String testMethod() {
		return "Hello";
	}
	
	
	@GetMapping("/test/")
	public String testMethodTwo() {
		return "Hello 2";
	}
}
