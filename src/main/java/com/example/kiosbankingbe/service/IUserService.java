package com.example.kiosbankingbe.service;




import com.example.kiosbankingbe.model.request.UserRequest;
import com.example.kiosbankingbe.model.response.BaseResponse;
import com.example.kiosbankingbe.model.response.UserResponse;

import javax.security.auth.message.AuthException;

public interface IUserService {

    BaseResponse createUser(UserRequest request);

//    BaseResponse getUserByRole(UserRequest request);

    UserResponse validateUser(String userName, String password) throws AuthException;
}
