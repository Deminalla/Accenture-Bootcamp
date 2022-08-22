package com.example.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting") // it will expect the path http://localhost:8080/greeting
    // only supports get type http and is shortcut for @RequestMapping(method = requestMethod.GET, path = "/greeting")
    //because RequestMapping also allows cutomizing and bby default allows different http types like post, delete and so on
    Greeting greeting(@RequestParam(defaultValue = "Deniza") String name){ // in case we don't input/gave the name
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
