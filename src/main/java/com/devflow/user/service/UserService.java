package com.devflow.user.service;

import com.devflow.user.dto.request.RegisterUserRequest;
import com.devflow.user.dto.response.UserResponse;

public interface UserService {
    UserResponse register(RegisterUserRequest request);
}
