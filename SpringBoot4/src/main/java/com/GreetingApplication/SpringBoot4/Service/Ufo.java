package com.GreetingApplication.SpringBoot4.Service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("Singleton")
@Lazy
@Scope("prototype")
/*
For singleton beans, Spring manages the entire lifecycle — creation and destruction — because it keeps a reference to that one bean for the whole application lifetime, and can call destroy callbacks when the container shuts down.
For prototype beans, Spring's responsibility ends right after handing the object to you via getBean(). Spring does not keep a reference to prototype beans after creation,
so: It has no way of knowing when you're "done" with the object
It can't track when the object becomes eligible for garbage collection
Therefore it cannot call @PreDestroy — there's no hook for it
From the Spring documentation itself: "Unlike the other scopes, Spring does not manage the complete lifecycle of a prototype bean... the container does not call any destruction lifecycle callback methods."
 */
public class Ufo {

    static {
        System.out.println("Static init block");
    }

    {
        System.out.println("Java init block");
    }

    public Ufo() {
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
