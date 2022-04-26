package com.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {
	
	@GetMapping("/userServiceFallBack")
	public String userServiceFallBackMethod() {
		return "User Service is taking longer";
		
	}
	
	@GetMapping("/departmentServiceFallBack")
	public String departmentServiceFallBackMethod() {
		return "Department Service is taking longer";
		
	}

}
