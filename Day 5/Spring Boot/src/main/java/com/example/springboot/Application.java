package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// includes @Configuration (Tags the class as a source of bean definitions for the application context),
// @EnableAutoConfiguration,
// @ComponentScan (Tells Spring to look for other components, configurations, and services in the com/example package, letting it find the controllers)
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
