package com.example.demo.employee;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {


}
