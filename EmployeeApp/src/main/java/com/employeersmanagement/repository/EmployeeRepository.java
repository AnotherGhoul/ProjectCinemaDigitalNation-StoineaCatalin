package com.employeersmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employeersmanagement.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
