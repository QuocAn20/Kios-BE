package com.example.kiosbankingbe.service;

import com.example.kiosbankingbe.model.request.MenuRequest;
import com.example.kiosbankingbe.model.response.BaseResponse;

public interface IMenuService {

    BaseResponse getMenu(MenuRequest request);

    BaseResponse getMenuByRole(MenuRequest request);

    BaseResponse updateMenu(MenuRequest request);

    BaseResponse createMenu(MenuRequest request);

    BaseResponse deleteMenu(MenuRequest request);
}
