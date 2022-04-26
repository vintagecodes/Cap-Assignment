package com.department.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.department.model.Department;
import com.department.repository.DepartmentRepository;

@Service
public class DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepository;
	
	public Department saveDepartment(Department department) {
		return departmentRepository.save(department);
	}
	
	public List<Department> getAllDetails() {
		return departmentRepository.findAll();
	}
	
	public Optional<Department> getDepartmentByID(long departmentId) {
		
		return departmentRepository.findById(departmentId);
		
	}
}
