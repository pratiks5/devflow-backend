package com.devflow.auth.service.impl;

import com.devflow.auth.dto.LoginRequest;
import com.devflow.auth.dto.LoginResponse;
import com.devflow.auth.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final AuthenticationManager authenticationManager;


    @Override
    public LoginResponse login(LoginRequest request) {
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                request.getEmail(),
                request.getPassword()
        ));
        System.out.println("Pratik-->"+authentication.getPrincipal());
        System.out.println(authentication.getAuthorities());
        System.out.println(authentication.isAuthenticated());
        return new LoginResponse("Login Successful");
    }
}
