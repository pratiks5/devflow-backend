package com.devflow.auth.service;

import com.devflow.auth.dto.LoginRequest;
import com.devflow.auth.dto.LoginResponse;

public interface AuthService {
    LoginResponse login(LoginRequest request);
}
