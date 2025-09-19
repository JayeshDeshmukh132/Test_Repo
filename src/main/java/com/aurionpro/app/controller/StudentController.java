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
	
}
