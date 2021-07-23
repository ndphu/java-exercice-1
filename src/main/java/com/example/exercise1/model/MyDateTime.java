package com.example.exercise1.model;

import java.time.Instant;

public class MyDateTime {
    public Instant time;

    public Instant getTime() {
        return time;
    }

    public void setTime(Instant time) {
        this.time = time;
    }
    public void setTime(Instant time, String value) {
        System.out.println("value = " + value);
        this.time = time;
    }
}