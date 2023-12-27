package com.example.kiosbankingbe.mapper;

import com.example.kiosbankingbe.model.request.TicketRequest;
import com.example.kiosbankingbe.model.response.EmployeeResponse;
import com.example.kiosbankingbe.model.response.TicketResponse;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

@Mapper
public interface TicketMapper {
    public TicketResponse create(TicketRequest request);

    public List<TicketResponse> get(TicketRequest request);

    public List<TicketResponse> getForTV(TicketRequest request);

    public int update(TicketRequest request);

    public int delete(TicketRequest request);

    public int evaluate(TicketRequest request);

    public int countTicket(TicketRequest request);

    public int statisticTicketDone(String moth);

    public int statisticTicketInProgress(String moth);

    public int statisticTicketNotStart(String moth);

    public int countNotStartTicket(TicketRequest request);

    public int countInProgressTicket(TicketRequest request);

    public int countDoneTicket(TicketRequest request);

    public EmployeeResponse statisticEmployee(@Param("id") String id, @Param("date") Date date,
                                              @Param("month")String month, @Param("year")String year);
}
