package com.example.kiosbankingbe.service;

import com.example.kiosbankingbe.model.request.ScreenRequest;
import com.example.kiosbankingbe.model.response.BaseResponse;


public interface IScreenService {
    public BaseResponse getScreen(ScreenRequest request);

    public BaseResponse createScreen(ScreenRequest request);

    public BaseResponse updateScreen(ScreenRequest request);

    public BaseResponse deleteScreen(ScreenRequest request);

}
