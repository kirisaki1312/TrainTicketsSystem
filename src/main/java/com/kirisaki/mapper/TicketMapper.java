package com.kirisaki.mapper;

import com.kirisaki.pojo.*;

import java.util.List;

public interface TicketMapper {
    int deleteByPrimaryKey(Integer ticket_id);

    int insert(Ticket record);

    int insertSelective(Ticket record);

    List<Ticket> selectByExample(TicketExample example);

    Ticket selectByPrimaryKey(Integer ticket_id);

    int updateByPrimaryKeySelective(Ticket record);

    int updateByPrimaryKey(Ticket record);

    //以下为新加入的复杂SQL
    List<QueryTicket> selectByCityAndDate(String date, Integer start_index, Integer end_index);

    List<RemainSeat> selectRemainSeat(Integer train_id, String date, Integer start_index, Integer end_index);

    List<RemainSeatDetail> selectRemainSeatDetail(Integer train_id, String date, Integer start_index, Integer end_index);

    List<Ticket> selectByUserId(Integer user_id);
}