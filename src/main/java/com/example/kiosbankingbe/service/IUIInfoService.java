package com.example.kiosbankingbe.service;

import com.example.kiosbankingbe.model.request.UIInfoRequest;
import com.example.kiosbankingbe.model.response.BaseResponse;

public interface IUIInfoService {

    public BaseResponse getUiById(UIInfoRequest request);
    public BaseResponse getAll(UIInfoRequest request);
    public BaseResponse updateUi(UIInfoRequest request);
    public BaseResponse createUi(UIInfoRequest request);
    public BaseResponse deleteUi(UIInfoRequest request);
}
