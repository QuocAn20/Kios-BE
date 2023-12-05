package com.example.kiosbankingbe.service.Impl;


import com.example.kiosbankingbe.mapper.UserMapper;
import com.example.kiosbankingbe.model.request.UserRequest;
import com.example.kiosbankingbe.model.response.BaseResponse;
import com.example.kiosbankingbe.model.response.UserResponse;
import com.example.kiosbankingbe.service.IUserService;
import com.google.common.base.Strings;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.security.auth.message.AuthException;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper mapper;

    public BaseResponse createUser(UserRequest request) {
        try{
            if (request == null || Strings.isNullOrEmpty(request.getName())
                    || Strings.isNullOrEmpty(request.getUserName())
                    || Strings.isNullOrEmpty(request.getPassword())) {
                return new BaseResponse(String.valueOf(HttpStatus.BAD_REQUEST.value()),
                        "Fiels is requried");
            }

            String hashedPassword = BCrypt.hashpw(request.getPassword(), BCrypt.gensalt(10));
            request.setPassword(hashedPassword);
            return null;
        }catch (Exception e){
            return new BaseResponse("1", "Failure");
        }
    }

//    @Override
//    public BaseResponse getUserByRole(UserRequest request) {
//        try{
//            UserResponse users = mapper.getUserByRole(request.getUserName());;
//            if(request.getRole() == "ADMIN") {
//
//            }
//            return new BaseResponse("0", "Success");
//
//        }catch (Exception e){
//            return new BaseResponse("1", "Failure");
//        }
//    }

    public UserResponse validateUser(String userName, String password) throws AuthException {
        try{
            UserResponse user = mapper.finAccountByUsername(userName);

            if(!BCrypt.checkpw(password, user.getPassword())) {
                return null;
            }
            user.setPassword(null);
            return user;

        }catch (EmptyResultDataAccessException e){
            throw new AuthException("Invalid username/password");
        }
    }
}
