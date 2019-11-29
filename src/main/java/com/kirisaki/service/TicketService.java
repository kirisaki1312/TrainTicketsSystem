package com.kirisaki.service;


import com.kirisaki.pojo.QueryTicketAndSeat;
import com.kirisaki.pojo.TicketBought;
import com.kirisaki.pojo.RemainSeat;
import com.kirisaki.pojo.RemainSeatDetail;
import com.kirisaki.util.Page;

import java.util.List;

public interface TicketService {

    List<QueryTicketAndSeat> queryTicketList(String date, String start_city, String end_city);

    List<RemainSeat> queryRemainSeat(Integer train_id, String date, Integer start_index, Integer end_index);

    List<RemainSeatDetail> queryRemainSeatDetail(Integer train_id, String date, Integer start_index, Integer end_index);

    Integer bookTicket(Integer user_id, Integer train_id, String train_name, Integer start_index, Integer end_index, String start_time, String end_time, String mileage, Integer seat_type_choose);

    List<TicketBought> bought(Integer user_id, Page page);

    Integer cancelTicket(Integer ticket_id);
}
