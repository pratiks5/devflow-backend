package com.devflow.user.service.impl;

import com.devflow.exception.BusinessUnitNotFoundException;
import com.devflow.exception.UserAlreadyExistsException;
import com.devflow.user.dto.request.RegisterUserRequest;
import com.devflow.user.dto.response.UserResponse;
import com.devflow.user.entity.BusinessUnit;
import com.devflow.user.entity.Role;
import com.devflow.user.entity.User;
import com.devflow.user.mapper.UserMapper;
import com.devflow.user.repository.BusinessUnitRepository;
import com.devflow.user.repository.UserRepository;
import com.devflow.user.service.UserService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final BusinessUnitRepository businessUnitRepository;
    private final PasswordEncoder passwordEncoder;
    private final UserMapper userMapper;

    public UserServiceImpl(UserRepository userRepository, BusinessUnitRepository businessUnitRepository, PasswordEncoder passwordEncoder, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.businessUnitRepository = businessUnitRepository;
        this.passwordEncoder = passwordEncoder;
        this.userMapper = userMapper;
    }

    @Override
    public UserResponse register(RegisterUserRequest request) {

        if (userRepository.existsByEmail(request.getEmail())) {
            throw new UserAlreadyExistsException("User Already Exists");
        }
        BusinessUnit bs=new BusinessUnit();
        bs.setId(request.getBusinessUnitId());
        bs.setName("Development");
        bs.setDescription("Development work is going on");

        BusinessUnit businessUnit = businessUnitRepository.findById(request.getBusinessUnitId()).orElse(businessUnitRepository.save(bs));

        /*BusinessUnit businessUnit = businessUnitRepository.findById(request.getBusinessUnitId()).orElseThrow(() ->
                new BusinessUnitNotFoundException("Busniness Unit not found"));*/

        User user = userMapper.toEntity(request);
        user.setRole(Role.DEVELOPER);
        user.setIsActive(true);
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        user.setBusinessUnit(businessUnit);
        User savedUser = userRepository.save(user);
        return userMapper.toResponse(savedUser);
    }
}
