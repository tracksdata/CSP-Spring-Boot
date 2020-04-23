package com.cts.employee.service;

import java.util.List;

import com.cts.employee.model.Employee;

public interface EmployeeService {

	void saveEmployee(Employee emp);

	List<Employee> findAll();

	Employee findById(int empId);

}