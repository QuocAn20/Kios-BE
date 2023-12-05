package com.example.kiosbankingbe.model.response;

import lombok.*;

@Getter
@Data
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UIInfoResponse {
    private String id;
    private String name;
    private String backgroundImage;
    private String createDate;
    private String editDate;
}
