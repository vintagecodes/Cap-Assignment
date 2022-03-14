package com.example.demo.authentication;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(method=RequestMethod.GET, value="/hi",headers = "Accept=application/json")
	public String sayHello() {
		return "Hi";
		
	}
	
	@RequestMapping("/auth")
	public List<User> getAllUsers() {
		return userService.getUser();
		
	}
	
	@RequestMapping("/auth/{userName}/{password}")
	public String userAuth(@PathVariable String userName, @PathVariable String password) {

		return userService.validateUser(userName,password);
	}

}
