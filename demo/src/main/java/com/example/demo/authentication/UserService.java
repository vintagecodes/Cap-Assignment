package com.example.demo.authentication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	

	private List<User> users = new ArrayList<>(Arrays.asList(
			new User("raj","answer"),
			new User("ritik","qwerty")
			
			));
	
	public List<User> getUser(){
		return users;
	}
	
	public String validateUser(String userName, String password) {
		String message = "";
		for(int i = 0; i<users.size();i++) {
			User u = users.get(i);
			if(u.getUserName().equals(userName) && u.getPassword().equals(password)) {
				System.out.println("Valid User");
				message = "Valid User";
				break;
			}
			else {
				System.out.println("Invalid User");
				message = "Invalid User";
			}
		}
		return message;
	}

}
