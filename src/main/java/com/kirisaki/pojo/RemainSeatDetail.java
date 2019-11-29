package com.kirisaki.pojo;

public class RemainSeatDetail {
    private Integer train_id;

    private Integer seat_id;

    private String seat_type;

    private String seat_location;

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

    public String getSeat_type() {
        return seat_type;
    }

    public void setSeat_type(String seat_type) {
        this.seat_type = seat_type;
    }

    public String getSeat_location() {
        return seat_location;
    }

    public void setSeat_location(String seat_location) {
        this.seat_location = seat_location;
    }

    @Override
    public String toString() {
        return "RemainSeatDetail{" +
                "train_id=" + train_id +
                ", seat_id=" + seat_id +
                ", seat_type='" + seat_type + '\'' +
                ", seat_location='" + seat_location + '\'' +
                '}';
    }
}
