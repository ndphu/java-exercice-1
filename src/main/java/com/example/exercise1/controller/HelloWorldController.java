package com.example.exercise1.controller;

import com.example.exercise1.model.HiResponse;
import com.example.exercise1.model.MyDateTime;
import com.example.exercise1.model.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloWorldController {
    // Spring profile
    @Value("${greeting.key2}")
    private String greetingKey;

    @Value("${greeting.new}")
    private String newKey;

    @Value("${greeting.newnew}")
    private String newnewKey;

//    @Value("#{${greetingKey}.key2}")
//    private Map<String, String> greetingKey;

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

    @PostMapping("/api/sayHi")
    public HiResponse sayHi(@RequestBody User user) {
        HiResponse result = new HiResponse();
        String message = String.format("%s %s - %s", greetingKey, user.name, newKey);
        result.setMessage(message);
        return result;
    }

}
