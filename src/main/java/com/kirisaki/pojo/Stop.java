package com.kirisaki.pojo;

public class Stop {
    private Integer stop_id;

    private String stop_name;

    private String city_name;

    public Integer getStop_id() {
        return stop_id;
    }

    public void setStop_id(Integer stop_id) {
        this.stop_id = stop_id;
    }

    public String getStop_name() {
        return stop_name;
    }

    public void setStop_name(String stop_name) {
        this.stop_name = stop_name == null ? null : stop_name.trim();
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name == null ? null : city_name.trim();
    }

    @Override
    public String toString() {
        return "Stop{" +
                "stop_id=" + stop_id +
                ", stop_name='" + stop_name + '\'' +
                ", city_name='" + city_name + '\'' +
                '}';
    }
}