package com.devflow.user.mapper;

import com.devflow.user.dto.request.RegisterUserRequest;
import com.devflow.user.dto.response.UserResponse;
import com.devflow.user.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public User toEntity(RegisterUserRequest request) {
        User user = new User();
        user.setName(request.getName());
        user.setEmail(request.getEmail());
        user.setDesignation(request.getDesignation());
        user.setPassword(request.getPassword());
        return user;
    }

    public UserResponse toResponse(User user) {
        UserResponse userResponse = new UserResponse();
        userResponse.setName(user.getName());
        userResponse.setEmail(user.getEmail());
        userResponse.setDesignation(user.getDesignation());
        userResponse.setBusinessUnit(user.getBusinessUnit().getName());
        userResponse.setActive(user.getIsActive());
        userResponse.setId(user.getId());
        userResponse.setRole(user.getRole());
        return userResponse;
    }
}
