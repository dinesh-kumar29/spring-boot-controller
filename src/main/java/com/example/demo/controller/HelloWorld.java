package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	@GetMapping("/dinesh")
	public String printHello() {
		return "dinesh";
		
	}

}
