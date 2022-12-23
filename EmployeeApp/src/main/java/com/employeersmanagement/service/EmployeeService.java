package com.employeersmanagement.service;

import java.util.List;

import com.employeersmanagement.entity.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();

	Employee saveEmployee(Employee employee);

	Employee getEmployeeById(Long id);

	Employee updateEmployee(Employee student);

	void deleteEmployeeById(Long id);

}
