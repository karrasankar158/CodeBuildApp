package com.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestApp {
	
	@GetMapping("/show")
	public String displayMessage() {
		
		return "Welcome to AWS";
	}
	
	@GetMapping("/show1")
	public Date displayMessage1() {
		
		return new Date();
	}

}
