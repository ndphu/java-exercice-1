package com.example.exercise1.model;

import java.time.Instant;

public class HiResponse {
    public String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public HiResponse(String name){
        this.message = "Hi " + name;
    }
}
