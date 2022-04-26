package com.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.model.User;
import com.service.models.TemplateResponse;
import com.service.service.UserService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
	
	@Autowired
	private UserService service;
	
	@PostMapping("/")
	public User saveUser(@RequestBody User user) {
		log.info("Inside saved User");
		return service.saveUser(user);
		
	}
	
	@GetMapping("/{userId}")
	public TemplateResponse getUserTemplate(@PathVariable("userId") long userId) {
		return service.getUserWithDepartment(userId);
	}
	

}
