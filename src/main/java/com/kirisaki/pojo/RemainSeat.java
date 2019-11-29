package com.kirisaki.pojo;

public class RemainSeat {
    private Integer train_id;

    private String seat_type;

    private String remain_num;

    public Integer getTrain_id() {
        return train_id;
    }

    public void setTrain_id(Integer train_id) {
        this.train_id = train_id;
    }

    public String getSeat_type() {
        return seat_type;
    }

    public void setSeat_type(String seat_type) {
        this.seat_type = seat_type;
    }

    public String getRemain_num() {
        return remain_num;
    }

    public void setRemain_num(String remain_num) {
        this.remain_num = remain_num;
    }

    @Override
    public String toString() {
        return "RemainSeat{" +
                "train_id=" + train_id +
                ", seat_type='" + seat_type + '\'' +
                ", remain_num='" + remain_num + '\'' +
                '}';
    }
}
