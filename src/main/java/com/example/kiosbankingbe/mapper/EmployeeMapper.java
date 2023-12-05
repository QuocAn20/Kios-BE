package com.example.kiosbankingbe.mapper;

import com.example.kiosbankingbe.model.request.EmployeeRequest;
import com.example.kiosbankingbe.model.response.EmployeeResponse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    public EmployeeResponse create(EmployeeRequest request);

    public List<EmployeeResponse> getEmployee(EmployeeRequest request);

    public List<EmployeeResponse> getEmployeeByRole(EmployeeRequest request);

    public List<EmployeeResponse> getAll();

    public int update(EmployeeRequest request);

    public int delete(EmployeeRequest request);

    public int countEmployee(EmployeeRequest request);

    public int checkInfo(EmployeeRequest request);

    String getAccountId(String employeeId);

    int getId();

    int restore(EmployeeRequest request);

    int remove(EmployeeRequest request);
}
