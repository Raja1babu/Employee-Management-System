package com.management.Employee.services;

import java.util.List;

import com.management.Employee.entity.EmployeeEnitity;
import com.management.Employee.model.Employee;

public interface EmployeeService {

	Employee createEmployee(Employee employee);

	List<EmployeeEnitity> getAllEmployees();

	boolean deleteEmployee(Long id);

	Employee getEmployeeById(Long id);

	Employee updateEmployee(Long id, Employee employee);
	
	

	

}
