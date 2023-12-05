package com.example.kiosbankingbe.model.response;

import lombok.*;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

@Getter
@Data
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ServiceBankingResponse {
    private String id;
    private String name;
    private String image;
    private String description;
    private String editDate;
    private String createDate;
}
