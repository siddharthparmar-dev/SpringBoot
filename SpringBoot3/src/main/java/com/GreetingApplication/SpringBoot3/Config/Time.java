package com.GreetingApplication.SpringBoot3.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Configuration
public class Time {

    @Bean
    public LocalDateTime generateTime()
    {
        return LocalDateTime.now();
    }


}
