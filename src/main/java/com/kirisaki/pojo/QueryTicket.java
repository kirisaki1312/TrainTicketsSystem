package com.kirisaki.pojo;

public class QueryTicket {
    private Integer train_id;

    private String train_name;

    private Integer start_index;

    private Integer end_index;

    private String start_city;

    private String end_city;

    private String start_time;

    private String end_time;

    private String mileage;

    public QueryTicket(){}

    public QueryTicket(Integer train_id, String train_name, Integer start_index, Integer end_index, String start_city, String end_city, String start_time, String end_time, String mileage) {
        this.train_id = train_id;
        this.train_name = train_name;
        this.start_index = start_index;
        this.end_index = end_index;
        this.start_city = start_city;
        this.end_city = end_city;
        this.start_time = start_time;
        this.end_time = end_time;
        this.mileage = mileage;
    }

    public Integer getTrain_id() {
        return train_id;
    }

    public void setTrain_id(Integer train_id) {
        this.train_id = train_id;
    }

    public String getTrain_name() {
        return train_name;
    }

    public void setTrain_name(String train_name) {
        this.train_name = train_name;
    }

    public Integer getStart_index() {
        return start_index;
    }

    public void setStart_index(Integer start_index) {
        this.start_index = start_index;
    }

    public Integer getEnd_index() {
        return end_index;
    }

    public void setEnd_index(Integer end_index) {
        this.end_index = end_index;
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

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "QueryTicket{" +
                "train_id=" + train_id +
                ", train_name='" + train_name + '\'' +
                ", start_index=" + start_index +
                ", end_index=" + end_index +
                ", start_city='" + start_city + '\'' +
                ", end_city='" + end_city + '\'' +
                ", start_time='" + start_time + '\'' +
                ", end_time='" + end_time + '\'' +
                ", mileage='" + mileage + '\'' +
                '}';
    }
}
