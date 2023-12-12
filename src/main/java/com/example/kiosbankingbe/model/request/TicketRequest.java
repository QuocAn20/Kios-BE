package com.example.kiosbankingbe.model.request;

import com.example.kiosbankingbe.model.dto.Paging;
import lombok.*;

import javax.persistence.Entity;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TicketRequest extends Paging {
    private String id;
    private String name;
    private String phone;
    private Date date;
    private String time;
    private String serviceId;
    private String employeeId;
    private String code;
    private int attitude;
    private String comment;
    private int stt;
    private int status;

    private String month;
    private String year;

    private String accountId;

//    export
    private String fileType;

}
