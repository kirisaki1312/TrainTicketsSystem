package com.kirisaki.pojo;

public class QueryTicketAndSeat extends QueryTicket {

    private Integer firstseat_num;

    private Integer secondseat_num;

    public QueryTicketAndSeat(){}

    public QueryTicketAndSeat(Integer train_id, String train_name, Integer start_index, Integer end_index, String start_city, String end_city, String start_time, String end_time, String mileage) {
        super(train_id, train_name, start_index, end_index, start_city, end_city, start_time, end_time, mileage);
    }

    public Integer getFirstseat_num() {
        return firstseat_num;
    }

    public void setFirstseat_num(Integer firstseat_num) {
        this.firstseat_num = firstseat_num;
    }

    public Integer getSecondseat_num() {
        return secondseat_num;
    }

    public void setSecondseat_num(Integer secondseat_num) {
        this.secondseat_num = secondseat_num;
    }

    @Override
    public String toString() {
        return super.toString() + "QueryTicketAndSeat{" +
                "firstseat_num=" + firstseat_num +
                ", secondseat_num=" + secondseat_num +
                '}';
    }

}
