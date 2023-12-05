package com.example.kiosbankingbe.controller;

import com.example.kiosbankingbe.model.request.ScreenRequest;
import com.example.kiosbankingbe.model.response.BaseResponse;
import com.example.kiosbankingbe.service.IScreenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(value = "/screen")
public class ScreenController {
    @Autowired
    private IScreenService screenService;

    @PostMapping(value = "/getScreen", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BaseResponse> getTicket(@RequestBody ScreenRequest request){
        return new ResponseEntity<>(screenService.getScreen(request), HttpStatus.OK);
    }

    @PostMapping(value = "/createScreen", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BaseResponse> createScreen(@RequestBody ScreenRequest request){
        return new ResponseEntity<>(screenService.createScreen(request), HttpStatus.OK);
    }

    @PostMapping(value = "/updateScreen", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BaseResponse> updateScreen(@RequestBody ScreenRequest request){
        return new ResponseEntity<>(screenService.updateScreen(request), HttpStatus.OK);
    }

    @PostMapping(value = "/deleteScreen", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BaseResponse> deleteScreen(@RequestBody ScreenRequest request){
        return new ResponseEntity<>(screenService.deleteScreen(request), HttpStatus.OK);
    }

}
