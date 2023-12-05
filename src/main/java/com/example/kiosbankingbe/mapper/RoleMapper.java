package com.example.kiosbankingbe.mapper;

import com.example.kiosbankingbe.model.request.EmployeeRequest;
import com.example.kiosbankingbe.model.response.EmployeeResponse;
import org.apache.ibatis.annotations.Mapper;

import javax.websocket.server.PathParam;
import java.util.List;

@Mapper
public interface RoleMapper {

    EmployeeResponse create(EmployeeRequest request);

    List<String> get(@PathParam("id") String id);

    int delete(@PathParam("id") String id);
}
