package com.example.kiosbankingbe.service;

import com.example.kiosbankingbe.model.request.ServiceBankingRequest;
import com.example.kiosbankingbe.model.response.BaseResponse;

public interface IServiceBankingService {

    public BaseResponse createService(ServiceBankingRequest request);

    public BaseResponse getService(ServiceBankingRequest request);

    public BaseResponse updateService(ServiceBankingRequest request);

    public BaseResponse deleteService(ServiceBankingRequest request);

    public BaseResponse restoreService(ServiceBankingRequest request);

    public BaseResponse removeService(ServiceBankingRequest request);

}
