package com.example.exercise1.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
@PropertySource("classpath:application.properties")
public class HiResponse {
    public HiResponse(){}

    @Autowired
    public HiResponse(@Value("${greeting.key2}") String key) {
        this.greetingKey = key;
    }

    private static String greetingKey;

    public String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String name) {
        this.message = greetingKey + " " + name;
    }

//    @Value("${greeting.key2}")
//    private String greetingKey;


}
