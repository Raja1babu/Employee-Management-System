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
	
	 @Override
		public boolean deleteEmployee(Long id) {
		 EmployeeEnitity employee = employeeRepository.findById(id).get();	
		 employeeRepository.delete(employee);
		 return true;
		}
	 
	 @Override
		public Employee getEmployeeById(Long id) {
		 EmployeeEnitity employeeEntity = employeeRepository.findById(id).get();
		 Employee employee = new Employee();
		 BeanUtils.copyProperties(employeeEntity, employee);
			return employee;
		}
	 
	 @Override
		public Employee updateEmployee(Long id, Employee employee) {
			EmployeeEnitity employeeEntity = employeeRepository.findById(id).get();
			employeeEntity.setEmail(employee.getEmail());
			employeeEntity.setFirstName(employee.getFirstName());
			employeeEntity.setLastName(employee.getLastName());
			return employee;
		}






}
