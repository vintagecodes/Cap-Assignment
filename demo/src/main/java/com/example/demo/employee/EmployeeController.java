package com.example.demo.employee;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/employees")
	public List<Employee> getAllEmployees(){
		
		return employeeService.getAllEmployee();
	}
	
	@RequestMapping("/employees/{employeeId}")
	public Optional<Employee> getEmployeeById(@PathVariable int employeeId){
		
		return employeeService.getEmployeeById(employeeId);
	}
	
	@RequestMapping(value="/employees", method=RequestMethod.POST)
	public void addEmployee(@RequestBody Employee employee) {
		
		employeeService.addEmployee(employee);
		
	}
	
	@RequestMapping(value="/employees/{employeeId}", method=RequestMethod.PUT)
	public void updateEmployee(@RequestBody Employee employee, @PathVariable int employeeId) {
		
		employeeService.updateEmployee(employeeId, employee);
	}
	
	@RequestMapping(value="/employees/{employeeId}", method=RequestMethod.DELETE)
	public void deleteEmployee(@PathVariable int employeeId) {
		employeeService.deleteTopic(employeeId);
	}

}
