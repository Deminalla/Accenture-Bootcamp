package com.example.spring;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @GetMapping("/hello") // it will expect the path http://localhost:8080/hello?name=Den
    // only supports get type http and is shortcut for @RequestMapping(method = requestMethod.GET, path = "/hello")
    //because RequestMapping also allows cutomizing and bby default allows different http types like post, delete and so on
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) { // in case we don't input/gave the name it will be World
        return String.format("Hello %s!", name);
    }
}