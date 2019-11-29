package com.kirisaki.service.impl;

import com.github.pagehelper.PageInfo;
import com.kirisaki.mapper.*;
import com.kirisaki.pojo.*;
import com.kirisaki.service.TicketService;
import com.kirisaki.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    TicketMapper ticketMapper;
    @Autowired
    StopMapper stopMapper;
    @Autowired
    LineMapper lineMapper;
    @Autowired
    SeatMapper seatMapper;
    @Autowired
    TrainMapper trainMapper;

    @Override
    public List<QueryTicketAndSeat> queryTicketList(String date, String start_city, String end_city) {

        StopExample example = new StopExample();
        example.createCriteria().andCity_nameEqualTo(start_city);
        List<Stop> result = stopMapper.selectByExample(example);
        Integer start_index = result.get(0).getStop_id();

        example = new StopExample();
        example.createCriteria().andCity_nameEqualTo(end_city);
        result = stopMapper.selectByExample(example);
        Integer end_index = result.get(0).getStop_id();

//        System.out.println(start_index+"--"+end_index);
        List<QueryTicketAndSeat> queryTicketAndSeats = new ArrayList<>();
        List<QueryTicket> queryTickets = ticketMapper.selectByCityAndDate(date + "%", start_index, end_index);
        for (QueryTicket ticket:queryTickets) {
            QueryTicketAndSeat ticketAndSeat = new QueryTicketAndSeat(ticket.getTrain_id(),ticket.getTrain_name(),
                    ticket.getStart_index(),ticket.getEnd_index(),ticket.getStart_city(),ticket.getEnd_city(),
                    ticket.getStart_time(), ticket.getEnd_time(),ticket.getMileage());
            List<RemainSeat> remainSeats = ticketMapper.selectRemainSeat(ticket.getTrain_id(), date + "%", start_index, end_index);
            for (RemainSeat seat:remainSeats) {
                if("一等座".equals(seat.getSeat_type())){
                    ticketAndSeat.setFirstseat_num(Integer.parseInt(seat.getRemain_num()));
                }else if("二等座".equals(seat.getSeat_type())){
                    ticketAndSeat.setSecondseat_num(Integer.parseInt(seat.getRemain_num()));
                }
            }
            queryTicketAndSeats.add(ticketAndSeat);
        }
        return queryTicketAndSeats;

    }

    @Override
    public List<RemainSeat> queryRemainSeat(Integer train_id, String date, Integer start_index, Integer end_index) {

        return ticketMapper.selectRemainSeat(train_id, date+"%", start_index, end_index);
    }

    @Override
    public List<RemainSeatDetail> queryRemainSeatDetail(Integer train_id, String date, Integer start_index, Integer end_index) {

        return ticketMapper.selectRemainSeatDetail(train_id, date+"%", start_index, end_index);
    }

    @Override
    public Integer bookTicket(Integer user_id, Integer train_id, String train_name, Integer start_index, Integer end_index, String start_time, String end_time, String mileage, Integer seat_type_choose) {

        //计算费用,默认是300km/h的费用,判断座位类型,自动选择座位
        List<RemainSeatDetail> remainSeatDetails = ticketMapper.selectRemainSeatDetail(train_id, start_time.substring(0, 10) + "%", start_index, end_index);
        Integer seat_id = null;
        Double expense = null;
        if(seat_type_choose == 1){
            for (RemainSeatDetail remainSeatDetail:
            remainSeatDetails) {
                if("一等座".equals(remainSeatDetail.getSeat_type())){
                    seat_id = remainSeatDetail.getSeat_id();
                    expense = Double.parseDouble(mileage)*0.46*1.4;
                    break;
                }
            }
        }else if(seat_type_choose == 2){
            for (RemainSeatDetail remainSeatDetail:
                    remainSeatDetails) {
                if("二等座".equals(remainSeatDetail.getSeat_type())){
                    seat_id = remainSeatDetail.getSeat_id();
                    expense = Double.parseDouble(mileage)*0.46*1.0;
                    break;
                }
            }
        }
        //获取当前时间戳并转为String
        LocalDateTime time = LocalDateTime.now();
        Timestamp now = Timestamp.valueOf(time);
        String strNow = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(now);

        Ticket tickt = new Ticket(null, user_id, train_id, seat_id, start_time, start_index, end_time, end_index, strNow, expense, "未付款");

        return ticketMapper.insert(tickt);
    }

    @Override
    public List<TicketBought> bought(Integer user_id, Page page) {
        List<TicketBought> results = new ArrayList<>();

        /*TicketExample example = new TicketExample();
        example.createCriteria().andUser_idEqualTo(user_id);*/
        List<Ticket> tickets = ticketMapper.selectByUserId(user_id);
        int total = (int) new PageInfo<>(tickets).getTotal();
        page.setTotal(total);

        for (Ticket temp:tickets) {
            String train_name = trainMapper.selectByPrimaryKey(temp.getTrain_id()).getTrain_name();
            String seat_type = seatMapper.selectByPrimaryKey(temp.getSeat_id()).getSeat_type();
            String start_stop_name = stopMapper.selectByPrimaryKey(temp.getStart_stop_id()).getStop_name();
            String end_stop_name = stopMapper.selectByPrimaryKey(temp.getEnd_stop_id()).getStop_name();
            TicketBought qtb = new TicketBought(temp.getTicket_id(),temp.getUser_id(),temp.getTrain_id(),temp.getSeat_id(),temp.getStart_time(),temp.getStart_stop_id(),temp.getEnd_time(),temp.getEnd_stop_id(),temp.getCreate_at(),temp.getExpense(),temp.getStatus(),train_name,seat_type,start_stop_name,end_stop_name);
            results.add(qtb);
        }

        return results;
    }

    @Override
    public Integer cancelTicket(Integer ticket_id) {
        return ticketMapper.deleteByPrimaryKey(ticket_id);
    }


}
