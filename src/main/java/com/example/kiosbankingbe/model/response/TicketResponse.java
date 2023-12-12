package com.example.kiosbankingbe.model.response;

import lombok.*;

@Getter
@Data
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TicketResponse {
    private String id;
    private String name;
    private String phone;
    private String date;
    private String time;
    private String serviceId;
    private String employeeId;
    private String code;
    private int attitude;
    private String comment;
    private int stt;
    private int status;

    private String statusName;
    private String attitudeString;

//  get room field in employee table
    private String room;
}
