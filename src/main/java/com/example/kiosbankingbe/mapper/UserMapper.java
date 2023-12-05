package com.example.kiosbankingbe.mapper;

import com.example.kiosbankingbe.model.request.EmployeeRequest;
import com.example.kiosbankingbe.model.response.UserResponse;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    UserResponse createEmployeeAccount(EmployeeRequest request);

//    UserResponse getUserByRole(EmployeeRequest request);

    UserResponse finAccountByUsername(String userName);

    UserResponse checkUsernameExistion(String userName);
}
