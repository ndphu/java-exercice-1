package com.example.exercise1.controller;

import com.example.exercise1.model.MyDateTime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.Date;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot hello!";
    }

    @GetMapping("/home")
    public String home() {
        return "Hello, World!";
    }

    @GetMapping("/api/getTime")
    public MyDateTime getCurrentTime() {
        Instant time = Instant.now();
        MyDateTime result = new MyDateTime();
        result.setTime(time, "Oanh1");
        return result;
    }

    @GetMapping("/api/getRemainingTime")
    public long getRemainingTime() {
        Date startDate = new Date();
        Date endDate = new Date(2021, 9, 05);
        long timeMilli = endDate.getTime() - startDate.getTime();
        return timeMilli;
    }

}
