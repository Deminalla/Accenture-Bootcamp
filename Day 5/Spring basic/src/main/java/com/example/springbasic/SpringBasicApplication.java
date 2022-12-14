package com.example.springbasic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBasicApplication {


    public static void main(String[] args) {
        SpringApplication.run(SpringBasicApplication.class, args);
    }

    @GetMapping("/hello") // this tells Spring to use our hello() method to answer requests that get sent to the http://localhost:8080/hello?name=Den.
    // only supports get type http and is shortcut for @RequestMapping(method = requestMethod.GET, path = "/hello")
    //because RequestMapping also allows cutomizing and bby default allows different http types like post, delete and so on
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        // @RequestParam is telling Spring to expect a name value, but if it’s not there, it will use the word “World” by default
        return String.format("Hello %s!", name);
    }

}
            