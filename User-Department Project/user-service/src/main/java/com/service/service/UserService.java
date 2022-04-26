package com.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.service.controller.UserController;
import com.service.model.User;
import com.service.models.Department;
import com.service.models.TemplateResponse;
import com.service.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;


@Service
@Slf4j
public class UserService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	@Autowired
	private UserRepository userRepository;

	public User saveUser(User user) {
		// TODO Auto-generated method stub
		log.info("Inside saved User");
		return userRepository.save(user);
	}

	public TemplateResponse getUserWithDepartment(long userId) {
		// TODO Auto-generated method stub
		TemplateResponse response = new TemplateResponse();
		User user = userRepository.findByUserId(userId);
		Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/department/"+user.getUserId(),Department.class);
		
		response.setUser(user);
		response.setDepartment(department);
		return response;
		
	}
	
	
	

}
