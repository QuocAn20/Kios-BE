package com.example.kiosbankingbe.mapper;

import com.example.kiosbankingbe.model.request.MenuRequest;
import com.example.kiosbankingbe.model.response.MenuResponse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MenuMapper {

    List<MenuResponse> get(MenuRequest request);

    List<MenuResponse> getMenuByRole(MenuRequest request);

    MenuResponse create(MenuRequest request);

    int countMenu(MenuRequest request);

    int update(MenuRequest request);

    int delete(MenuRequest request);

    int checkPathExisted(MenuRequest request);

}
