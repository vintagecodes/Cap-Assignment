package com.example.demo.employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
//	private List<Employee> employee = new ArrayList<Employee>(Arrays.asList(
//			new Employee(1, "Henry", "CSE","Java Developer", 50000)
//			));
	
	public List<Employee> getAllEmployee(){
		
		List<Employee> employee = new ArrayList<>();
		employeeRepository.findAll().forEach(employee::add);
		return employee;
	}
	
	public Optional<Employee> getEmployeeById(int employeeId) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(employeeId);
	}
	
	public void addEmployee(Employee employee) {
		employeeRepository.save(employee);
	}
	
	public void updateEmployee(int employeeId, Employee employee) {
		employeeRepository.save(employee);
	}

	public void deleteTopic(int employeeId) {
		employeeRepository.deleteById(employeeId);
		
	}


}
