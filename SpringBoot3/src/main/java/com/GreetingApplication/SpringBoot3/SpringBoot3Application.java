package com.GreetingApplication.SpringBoot3;

import com.GreetingApplication.SpringBoot3.service.Alien;
import com.GreetingApplication.SpringBoot3.service.GreetingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBoot3Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringBoot3Application.class, args);
//		GreetingService greetingService = container.getBean(GreetingService.class);
//		System.out.println(greetingService.generateGreeting("Siddharth"));
		Alien alien = container.getBean(Alien.class);
		alien.show();
		alien.display();
	}

}
