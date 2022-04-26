package com.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.model.Student;
import com.student.service.StudentService;

@RestController
@RequestMapping("/student")
@CrossOrigin(allowedHeaders="*", origins="*")
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@PostMapping("/postStudent")
	public Student postStudent(@RequestBody Student student) {
		return service.postStudent(student);
	}

}
