package com.kirisaki.pojo;

public class Ticket {
    private Integer ticket_id;

    private Integer user_id;

    private Integer train_id;

    private Integer seat_id;

    private String start_time;

    private Integer start_stop_id;

    private String end_time;

    private Integer end_stop_id;

    private String create_at;

    private Double expense;

    private String status;

    public Ticket(){}

    public Ticket(Integer ticket_id, Integer user_id, Integer train_id, Integer seat_id, String start_time, Integer start_stop_id, String end_time, Integer end_stop_id, String create_at, Double expense, String status) {
        this.ticket_id = ticket_id;
        this.user_id = user_id;
        this.train_id = train_id;
        this.seat_id = seat_id;
        this.start_time = start_time;
        this.start_stop_id = start_stop_id;
        this.end_time = end_time;
        this.end_stop_id = end_stop_id;
        this.create_at = create_at;
        this.expense = expense;
        this.status = status;
    }

    public Integer getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(Integer ticket_id) {
        this.ticket_id = ticket_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getTrain_id() {
        return train_id;
    }

    public void setTrain_id(Integer train_id) {
        this.train_id = train_id;
    }

    public Integer getSeat_id() {
        return seat_id;
    }

    public void setSeat_id(Integer seat_id) {
        this.seat_id = seat_id;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time == null ? null : start_time.trim();
    }

    public Integer getStart_stop_id() {
        return start_stop_id;
    }

    public void setStart_stop_id(Integer start_stop_id) {
        this.start_stop_id = start_stop_id;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time == null ? null : end_time.trim();
    }

    public Integer getEnd_stop_id() {
        return end_stop_id;
    }

    public void setEnd_stop_id(Integer end_stop_id) {
        this.end_stop_id = end_stop_id;
    }

    public String getCreate_at() {
        return create_at;
    }

    public void setCreate_at(String create_at) {
        this.create_at = create_at == null ? null : create_at.trim();
    }

    public Double getExpense() {
        return expense;
    }

    public void setExpense(Double expense) {
        this.expense = expense;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticket_id=" + ticket_id +
                ", user_id=" + user_id +
                ", train_id=" + train_id +
                ", seat_id=" + seat_id +
                ", start_time='" + start_time + '\'' +
                ", start_stop_id=" + start_stop_id +
                ", end_time='" + end_time + '\'' +
                ", end_stop_id=" + end_stop_id +
                ", create_at='" + create_at + '\'' +
                ", expense=" + expense +
                ", status='" + status + '\'' +
                '}';
    }
}