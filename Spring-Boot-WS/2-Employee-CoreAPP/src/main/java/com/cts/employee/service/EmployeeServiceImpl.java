package com.cts.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.cts.employee.dao.EmployeeDao;
import com.cts.employee.model.Employee;

@Service
@Lazy
public class EmployeeServiceImpl implements EmployeeService {
	public EmployeeServiceImpl() {
		System.out.println("--- EmployeeService class object created");
	}

	@Autowired
	@Qualifier(value = "salariedDao")
	private EmployeeDao empDao; // injects Implementation class object of this interface

	public void saveEmployee(Employee emp) {
		empDao.saveEmployee(emp);
	}

	public List<Employee> findAll() {

		return empDao.findAll();
	}

	public Employee findById(int empId) {

		return empDao.findById(empId);
	}

}
