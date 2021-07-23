package com.example.exercise1.model;

public class HiResponse {
    public HiResponse(){}

    public String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String name) {
        this.message = "Hi " + name;
    }

}
