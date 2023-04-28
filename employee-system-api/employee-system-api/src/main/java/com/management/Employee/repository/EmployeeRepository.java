package com.management.Employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.management.Employee.entity.EmployeeEnitity;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEnitity, Long> {

}
