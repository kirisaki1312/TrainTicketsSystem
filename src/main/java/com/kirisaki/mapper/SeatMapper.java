package com.kirisaki.mapper;

import com.kirisaki.pojo.Seat;
import com.kirisaki.pojo.SeatExample;
import java.util.List;

public interface SeatMapper {
    int deleteByPrimaryKey(Integer seat_id);

    int insert(Seat record);

    int insertSelective(Seat record);

    List<Seat> selectByExample(SeatExample example);

    Seat selectByPrimaryKey(Integer seat_id);

    int updateByPrimaryKeySelective(Seat record);

    int updateByPrimaryKey(Seat record);
}