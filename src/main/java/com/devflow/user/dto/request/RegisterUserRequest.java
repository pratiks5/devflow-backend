package com.devflow.user.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class RegisterUserRequest {

    @NotBlank(message = "Name is required")
    private String name;

    @Email(message = "Invalid Email")
    private String email;

    @Size(min = 8, message = "Password must contain at least 8 characters")
    private String password;

    @NotNull(message = "Business Unit is required")
    private UUID businessUnitId;

    @NotBlank(message = "Designation is required")
    private String designation;
}
