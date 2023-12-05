package com.example.kiosbankingbe.controller;

import com.example.kiosbankingbe.model.request.ServiceBankingRequest;
import com.example.kiosbankingbe.model.response.BaseResponse;
import com.example.kiosbankingbe.service.IServiceBankingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(value = "/service")
public class ServiceBankingController {

    @Autowired
    private IServiceBankingService serviceBankingService;

    @PostMapping(value = "/createService", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BaseResponse> createService(@RequestBody ServiceBankingRequest request){
        return new ResponseEntity<>(serviceBankingService.createService(request), HttpStatus.OK);
    }

    @PostMapping(value = "/getService", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BaseResponse> getService(@RequestBody ServiceBankingRequest request){
        return new ResponseEntity<>(serviceBankingService.getService(request), HttpStatus.OK);
    }

    @PostMapping(value = "/updateService", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BaseResponse> updateService(@RequestBody ServiceBankingRequest request){
        return new ResponseEntity<>(serviceBankingService.updateService(request), HttpStatus.OK);
    }

    @PostMapping(value = "/deleteService", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BaseResponse> deleteService(@RequestBody ServiceBankingRequest request){
        return new ResponseEntity<>(serviceBankingService.deleteService(request), HttpStatus.OK);
    }

    @PostMapping(value = "/restoreService", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BaseResponse> restoreService(@RequestBody ServiceBankingRequest request){
        return new ResponseEntity<>(serviceBankingService.restoreService(request), HttpStatus.OK);
    }

    @PostMapping(value = "/removeService", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BaseResponse> removeService(@RequestBody ServiceBankingRequest request){
        return new ResponseEntity<>(serviceBankingService.removeService(request), HttpStatus.OK);
    }

}
