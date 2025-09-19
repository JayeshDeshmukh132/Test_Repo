package com.aurionpro.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app/student")
public class StudentController {
	
	@GetMapping
	public String getDetail() {
		return "Student";
	}
	
	@GetMapping
	public String getDetailsTwo() {
		return "Student Details are here";
	}
	
	@GetMapping
	public String getDetailsThree() {
		return "Student Details are here also";
	}
	
	
}
