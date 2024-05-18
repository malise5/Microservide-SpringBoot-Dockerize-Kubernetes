package io.github.malise.employeeservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import io.github.malise.employeeservice.model.EmployeeCreateRequest;
import io.github.malise.employeeservice.model.EmployeeResponse;
import jakarta.validation.Valid;


public interface EmployeeService {

    EmployeeResponse createEmployee(@Valid EmployeeCreateRequest employeeCreateRequest);

    List<EmployeeResponse> listAll();

    EmployeeResponse findByEmployeeNumber(Integer employeeNumber);
    
}