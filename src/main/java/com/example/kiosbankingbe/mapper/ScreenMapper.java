package com.example.kiosbankingbe.mapper;

import com.example.kiosbankingbe.model.request.ScreenRequest;
import com.example.kiosbankingbe.model.response.ScreenResponse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ScreenMapper {
    public ScreenResponse create(ScreenRequest request);

    public List<ScreenResponse> get(ScreenRequest request);

    public int update(ScreenRequest request);

    public int delete(ScreenRequest request);

    public int countScreen(ScreenRequest request);

    int checkDateExisted(ScreenRequest request);

    int checkTimeExisted(ScreenRequest request);
}
