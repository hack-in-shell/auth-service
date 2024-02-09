package com.example.openautth.service;

import com.example.openautth.domain.dto.LoginRequest;
import com.example.openautth.domain.dto.LoginResponse;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    public LoginResponse loginUser(LoginRequest loginRequest) {
        //TODO: validate user details
        //TODO: if user is valid, create session
        //TODO: create an ID token in redis to store user claims
        //TODO: create a access token to give to user
        //TODO: give user the access token
        return null;
    }

    public void logoutUser() {
        //TODO: remove ID/session token from redis
        //TODO: update user is as logged out
        //TODO: remove/invalidate access token from user
        //TODO: remove user session
        //TODO: Logout user
    }
}
