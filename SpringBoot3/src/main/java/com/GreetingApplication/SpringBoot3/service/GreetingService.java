package com.GreetingApplication.SpringBoot3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class GreetingService implements Greeting {

    @Autowired
    private LocalDateTime dateTime;

    public String generateGreeting(String name) {

        int time = dateTime.getHour();

        if (time < 12) {
            return "Good Morning " + name + "!";
        }
        else if (time < 15) {
            return "Good Afternoon " + name + "!";
        }
        else if (time < 20) {
            return "Good Evening " + name + "!";
        }
        else {
            return "Good Night " + name + "!";
        }
    }
}
