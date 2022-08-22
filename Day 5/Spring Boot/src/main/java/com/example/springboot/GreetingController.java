package com.example.springboot;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong(); // it's not a replacement for long int (good with multiple threads?)
    // it's an atomic variable

    @GetMapping("/greeting") // ensures that HTTP GET requests to "/greeting" are mapped to the greeting() method
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
        // returns a new Greeting object with id and content attributes based on the next value from the counter and formats the given name according to template
        // If you open the website 2 times, the id will have changed from 1 to 2.
        // This proves you're working against the same GreetingController across multiple requests and that its counter is incremented on each call
    }
}