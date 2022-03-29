package com.example.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.model.Employee;
import com.example.test.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repository;

	public String addEmployee(Employee employee) {
		repository.save(employee);
		return "New Employee Register Successfully with id : " + employee.getId();
	}

	public Employee getEmployee(int id) {
		return repository.findById(id).orElse(null);
	}

	public List<Employee> deleteEmployee(int id) {
		repository.deleteById(id);
		return repository.findAll();
	}

}
