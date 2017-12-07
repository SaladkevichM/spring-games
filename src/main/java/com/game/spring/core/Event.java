package com.game.spring.core;

import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

public class Event {

    public Event(Date date) {
        this.id = ThreadLocalRandom.current().nextInt();
        this.date = date;
    }

    private int id;
    private Date date;
    private String msg;   
    
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String toString() {
        return date + " " + id + " " + msg;        
    }
}
