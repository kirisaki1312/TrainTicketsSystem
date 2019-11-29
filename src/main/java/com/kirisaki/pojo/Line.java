package com.kirisaki.pojo;

public class Line extends LineKey {
    private String arrive_time;

    private Double mileage;

    public String getArrive_time() {
        return arrive_time;
    }

    public void setArrive_time(String arrive_time) {
        this.arrive_time = arrive_time == null ? null : arrive_time.trim();
    }

    public Double getMileage() {
        return mileage;
    }

    public void setMileage(Double mileage) {
        this.mileage = mileage;
    }
}