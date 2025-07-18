package com.mohan.postgres_test.dto;

import com.mohan.postgres_test.annotation.UniqueEmail;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class EmployeeRequestDTO {
    @Valid

    @NotNull(message = "name cannot be null")
    private String name;

    @NotNull(message = "email cannot be null")
    @UniqueEmail
    private String email;

    @NotNull(message = "password cannot be null")
    @Size(min = 6, max = 12, message = "password size must be within 6 to 12 characters")
    private String password;
}
