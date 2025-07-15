package com.mohan.postgres_test.service;


import com.mohan.postgres_test.entity.Employee;
import com.mohan.postgres_test.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repo;

    public Employee createEmployee(Employee employee){
       return repo.save(employee);
    }
}
