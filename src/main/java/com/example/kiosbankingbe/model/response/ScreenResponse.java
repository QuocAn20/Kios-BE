package com.example.kiosbankingbe.model.response;

import lombok.*;

@Getter
@Data
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ScreenResponse {
    private String id;
    private String name;
    private String image;
    private String startDate;
    private String endDate;
    private String startTime;
    private String endTime;
    private String createDate;
    private String editDate;
}
