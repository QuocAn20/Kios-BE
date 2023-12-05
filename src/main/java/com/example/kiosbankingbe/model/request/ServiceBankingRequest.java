package com.example.kiosbankingbe.model.request;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

@Getter
@Setter
@Data
public class ServiceBankingRequest {
    private String id;
    private String name;
    private String image;
    private String description;
    private int deleted;
    private String deletedDate;
    private String restoreDate;

    private int page;
    private int limit;
}
