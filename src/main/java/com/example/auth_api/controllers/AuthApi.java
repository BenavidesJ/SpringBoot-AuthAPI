package com.example.auth_api.controllers;

import com.example.auth_api.common.constants.ApiPathConstants;
import com.example.auth_api.common.dtos.TokenResponse;
import com.example.auth_api.common.dtos.UserRequest;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(ApiPathConstants.API_VERSION + ApiPathConstants.ROUTE)
public interface AuthApi {
    @PostMapping(value = "/register")
    ResponseEntity<TokenResponse> createUser(@RequestBody @Valid UserRequest userRequest);

    @PostMapping(value = "/login")
    ResponseEntity<String> getUser(@RequestAttribute(name = "X-User-Id") String userId);
}
