package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context=SpringApplication.run(FirstApplication.class, args);
        Alien a= (Alien) context.getBean("Alien");
        a.show();
    }

}
