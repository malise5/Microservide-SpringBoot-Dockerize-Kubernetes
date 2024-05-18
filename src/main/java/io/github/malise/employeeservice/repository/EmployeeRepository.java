package io.github.malise.employeeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.malise.employeeservice.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
    
}
