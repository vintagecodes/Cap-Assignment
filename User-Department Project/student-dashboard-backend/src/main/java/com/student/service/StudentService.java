package com.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.model.Student;
import com.student.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repository;
	
	public Student postStudent(Student student) {
		
		return repository.save(student);
		
	}

}
