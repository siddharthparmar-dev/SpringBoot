package com.GreetingApplication.SpringBoot3.service;

import org.springframework.stereotype.Component;

@Component
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

}
