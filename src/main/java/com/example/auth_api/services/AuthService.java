package com.example.auth_api.services;

import com.example.auth_api.common.dtos.TokenResponse;
import com.example.auth_api.common.dtos.UserRequest;
import com.example.auth_api.repositories.UserRepository;

public interface AuthService {

    TokenResponse createUser(UserRequest userRequest);

}
