package com.GreetingApplication.SpringBoot3.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Alien {

    static {
        System.out.println("Static init block");
    }

    {
        System.out.println("Java init block");
    }

    public Alien() {
        System.out.println("Alien Bean Created Constructor");
    }

    public static void display(){
        System.out.println("Display Bean Created");
    }

    public void show(){
        System.out.println("Show method of alien");
    }

    @PostConstruct
    public void post(){
        System.out.println("Post construct method of alien");
    }

    @PreDestroy
    public void pre(){
        System.out.println("Pre destory method of alien");
    }
}
