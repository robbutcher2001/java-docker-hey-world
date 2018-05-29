package com.website;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.SpringApplication;

@RestController
@EnableAutoConfiguration
public class App {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(App.class, args);
    }

}
