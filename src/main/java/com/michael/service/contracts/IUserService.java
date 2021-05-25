package com.michael.service.contracts;


import com.michael.model.User;
import com.michael.request.UserLoginRequest;
import com.michael.request.UserRegisterRequest;

public interface IUserService {

    User register(UserRegisterRequest userRegisterRequest);
    User login(UserLoginRequest userLoginRequest);
}