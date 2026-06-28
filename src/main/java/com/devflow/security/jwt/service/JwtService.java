package com.devflow.security.jwt.service;

import io.jsonwebtoken.Claims;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.UUID;
import java.util.function.Function;

public interface JwtService {

    String generateToken(UserDetails userDetails);

    String extractUsername(String token);

    <T> T extractClaim(String token, Function<Claims, T> claimsResolver);

    String extractRole(String token);

    String extractBusinessUnit(String token);

    UUID extractUserId(String token);

    boolean isTokenValid(String token, UserDetails userDetails);
}
