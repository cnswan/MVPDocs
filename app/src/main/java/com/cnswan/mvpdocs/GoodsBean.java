package com.cnswan.mvpdocs;

/**
 * Created by 00013259 on 2017/9/26.
 */

public class GoodsBean {

    private int    number;
    private String name;
    private String time;

    public GoodsBean() {
    }

    public GoodsBean(int number, String name, String time) {
        this.number = number;
        this.name = name;
        this.time = time;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
