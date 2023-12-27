package com.example.kiosbankingbe.service;

import com.example.kiosbankingbe.model.request.TicketRequest;
import com.example.kiosbankingbe.model.response.BaseResponse;

import java.io.File;


public interface ITicketService {
    public BaseResponse getTicket(TicketRequest request);

    public BaseResponse getTicketForTV(TicketRequest request);

    public BaseResponse createTicket(TicketRequest request);

//    public BaseResponse fakeCreateTicket(TicketRequest request);

    public BaseResponse updateTicket(TicketRequest request);

    public BaseResponse deleteTicket(TicketRequest request);

    public BaseResponse evaluateTicket(TicketRequest request);

    public BaseResponse statisticMonthly(TicketRequest request);

    public BaseResponse getCountTicket(TicketRequest request);

    public BaseResponse getTicketDataForEmployee(TicketRequest request);

    File export(TicketRequest request);
}
