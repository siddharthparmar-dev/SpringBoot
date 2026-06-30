package com.GreetingApplication.SpringBoot4;

import com.GreetingApplication.SpringBoot4.Service.Ufo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.lang.reflect.Array;
import java.util.Arrays;

@SpringBootApplication
public class SpringBoot4Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ioc = SpringApplication.run(SpringBoot4Application.class, args);
		Ufo ufo1 = ioc.getBean(Ufo.class);
		Ufo ufo2 = ioc.getBean(Ufo.class);
		System.out.println(ufo1 == ufo2);
		ufo1.show();
		Ufo.display();
		int count = ioc.getBeanDefinitionCount();
		System.out.println(count);
		String[] beanNames = ioc.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beanNames));
	}

}
