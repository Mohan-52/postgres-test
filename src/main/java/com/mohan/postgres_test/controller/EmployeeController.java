package com.mohan.postgres_test.controller;

import com.mohan.postgres_test.dto.EmployeeRequestDTO;
import com.mohan.postgres_test.entity.Employee;
import com.mohan.postgres_test.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping
    public Employee createEmployee(@Valid @RequestBody EmployeeRequestDTO employee){
        return service.createEmployee(employee);
    }

}
