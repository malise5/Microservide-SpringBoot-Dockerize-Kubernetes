package io.github.malise.employeeservice.controller;

import org.springframework.web.bind.annotation.RestController;

import io.github.malise.employeeservice.model.EmployeeCreateRequest;
import io.github.malise.employeeservice.model.EmployeeResponse;
import io.github.malise.employeeservice.service.EmployeeService;
import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;





@RestController
@RequestMapping("/api/employee")

public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

   
    @PostMapping
    public EmployeeResponse create(@RequestBody @Valid EmployeeCreateRequest employeeCreateRequest) {
       return employeeService.createEmployee(employeeCreateRequest);
    }

    @GetMapping("path")
    public List<EmployeeResponse> list() {
        return employeeService.listAll();
    }

    @GetMapping("{employeeNumber}")
    public EmployeeResponse findByEmployeeNumber(@RequestParam(value = "employeeNumber") Integer employeeNumber) {
        return employeeService.findByEmployeeNumber(employeeNumber);
    }
    
    
    

    
    
}
