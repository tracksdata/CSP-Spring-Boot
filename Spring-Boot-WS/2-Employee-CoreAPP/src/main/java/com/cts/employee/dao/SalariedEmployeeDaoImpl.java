package com.cts.employee.dao;

import java.util.List;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.cts.employee.model.Employee;
@Repository(value = "salariedDao")
@Lazy
public class SalariedEmployeeDaoImpl implements EmployeeDao {
	
	public SalariedEmployeeDaoImpl() {
		System.out.println("--- SalariedEmployeeDao class object created");

	}
	
	public void saveEmployee(Employee emp) {
		System.out.println("SalariedEmployeeDao: saving employee");

	}

	public List<Employee> findAll() {
		System.out.println("SalariedEmployeeDao: listing all employees");
		return null;
	}

	public Employee findById(int empId) {
		System.out.println("SalariedEmployeeDao: finding employee");
		return null;
	}

}
