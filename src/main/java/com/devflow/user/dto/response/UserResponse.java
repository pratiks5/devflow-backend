package com.devflow.user.dto.response;

import com.devflow.user.entity.Role;
import lombok.Setter;

import java.util.UUID;

@Setter
public class UserResponse {
    UUID id;

    String name;

    String email;

    Role role;

    String designation;

    String businessUnit;

    boolean active;
}
