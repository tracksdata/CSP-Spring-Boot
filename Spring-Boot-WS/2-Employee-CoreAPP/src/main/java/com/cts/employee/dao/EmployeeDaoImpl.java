package com.cts.employee.dao;

import java.util.List;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.cts.employee.model.Employee;

@Repository(value = "empDao")
@Lazy
public class EmployeeDaoImpl implements EmployeeDao {

	public EmployeeDaoImpl() {
		System.out.println("--- EmployeeDao class object created");
	}

	public void saveEmployee(Employee emp) {
		System.out.println("Dao: " + emp.getEmpId() + " saved to DB");
	}

	public List<Employee> findAll() {
		System.out.println("Dao: listing all employees");
		return null;
	}

	public Employee findById(int empId) {

		System.out.println("Dao: finding employee for " + empId);
		return null;
	}

}
