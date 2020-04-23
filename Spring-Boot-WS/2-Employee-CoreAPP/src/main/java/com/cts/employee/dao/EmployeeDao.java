package com.cts.employee.dao;

import java.util.List;

import com.cts.employee.model.Employee;

public interface EmployeeDao {

	void saveEmployee(Employee emp);

	List<Employee> findAll();

	Employee findById(int empId);

}