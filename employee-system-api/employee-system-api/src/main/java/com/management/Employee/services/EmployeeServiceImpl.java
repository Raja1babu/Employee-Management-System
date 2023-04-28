package com.management.Employee.services;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.Employee.entity.EmployeeEnitity;
import com.management.Employee.model.Employee;
import com.management.Employee.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	
	
	
    @Autowired
	private EmployeeRepository employeeRepository;

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	@Override
	public Employee createEmployee(Employee employee) {
		EmployeeEnitity employeeEntity = new EmployeeEnitity();
		
		
		BeanUtils.copyProperties(employee, employeeEntity);
		employeeRepository.save(employeeEntity);
		return employee;
	}
	
	@Override
	public List<EmployeeEnitity> getAllEmployees() {
		return this.employeeRepository.findAll();
	}


}
