package com.example.openautth.controller;

import com.example.openautth.common.utils.ApiResponse;
import com.example.openautth.common.utils.ResponseUtils;
import com.example.openautth.domain.dto.CreateUserRequest;
import com.example.openautth.domain.dto.CreateUserResponse;
import com.example.openautth.domain.dto.LoginRequest;
import com.example.openautth.domain.dto.LoginResponse;
import com.example.openautth.service.LoginService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping(value = "api/register")
public class LoginResource {
	private final LoginService loginService;

    @PostMapping("/login")
	public ApiResponse<LoginResponse> registerUser(@RequestBody LoginRequest loginRequest) {
		LoginResponse response = loginService.loginUser(loginRequest);
		return ResponseUtils.createSuccessResponseObject("Success", response);
	}
}
