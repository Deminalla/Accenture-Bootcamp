package com.example.spring2;

// shows error in command prompt with mvnw spring-boot:run

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Spring2Application {

    private static final Logger log = LoggerFactory.getLogger(Spring2Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Spring2Application.class, args);
    }

    @Configuration
    public class RestTemplateConfiguration {
        @Bean
        public RestTemplate restTemplate() {
            RestTemplateBuilder builder = new RestTemplateBuilder();
            return builder.build();
        }
    }
    /*
    @Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) { // issue with builder
		return builder.build();
	}
     */

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {
            Quote quote = restTemplate.getForObject(
                    "https://quoters.apps.pcfone.io/api/random", Quote.class);
            log.info(quote.toString());
        };
    }
}