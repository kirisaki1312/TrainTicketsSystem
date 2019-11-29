package com.kirisaki.pojo;

public class TicketBought extends Ticket {

    private String train_name;

    private String seat_type;

    private String start_city;

    private String end_city;

    public TicketBought(){}

    public TicketBought(Integer ticket_id, Integer user_id, Integer train_id, Integer seat_id, String start_time, Integer start_stop_id, String end_time, Integer end_stop_id, String create_at, Double expense, String status, String train_name, String seat_type, String start_city, String end_city) {
        super(ticket_id, user_id, train_id, seat_id, start_time, start_stop_id, end_time, end_stop_id, create_at, expense, status);
        this.train_name = train_name;
        this.seat_type = seat_type;
        this.start_city = start_city;
        this.end_city = end_city;
    }

    public String getTrain_name() {
        return train_name;
    }

    public void setTrain_name(String train_name) {
        this.train_name = train_name;
    }

    public String getSeat_type() {
        return seat_type;
    }

    public void setSeat_type(String seat_type) {
        this.seat_type = seat_type;
    }

    public String getStart_city() {
        return start_city;
    }

    public void setStart_city(String start_city) {
        this.start_city = start_city;
    }

    public String getEnd_city() {
        return end_city;
    }

    public void setEnd_city(String end_city) {
        this.end_city = end_city;
    }

    @Override
    public String toString() {
        return super.toString()+"TicketBought{" +
                "train_name='" + train_name + '\'' +
                ", seat_type='" + seat_type + '\'' +
                ", start_city='" + start_city + '\'' +
                ", end_city='" + end_city + '\'' +
                '}';
    }
}
