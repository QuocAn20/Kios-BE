package com.example.kiosbankingbe.model.response;

import lombok.*;

@Getter
@Data
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RoleResponse {
    private String id;
    private String employeeId;
    private String serviceId;

//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public void setEmployeeId(String employeeId) {
//        this.employeeId = employeeId;
//    }
//
//    public void setServiceId(String serviceId) {
//        this.serviceId = serviceId;
//    }
}
