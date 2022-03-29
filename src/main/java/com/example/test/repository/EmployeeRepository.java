package com.example.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.test.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
