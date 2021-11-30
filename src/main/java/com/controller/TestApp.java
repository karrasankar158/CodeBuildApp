package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApp {
	
	@GetMapping("/")
	public String displayMessage() {
		
		return "Welcome to AWS";
	}

}
