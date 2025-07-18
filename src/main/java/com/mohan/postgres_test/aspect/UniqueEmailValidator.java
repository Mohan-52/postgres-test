package com.mohan.postgres_test.aspect;

import com.mohan.postgres_test.annotation.UniqueEmail;
import com.mohan.postgres_test.service.EmployeeService;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UniqueEmailValidator implements ConstraintValidator<UniqueEmail, String> {

    @Autowired
    EmployeeService service;

    @Override
    public boolean isValid(String email, ConstraintValidatorContext context) {

        return !service.emailExists(email);
    }
}
