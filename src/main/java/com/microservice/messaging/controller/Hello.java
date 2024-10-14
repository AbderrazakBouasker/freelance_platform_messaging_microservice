package com.microservice.messaging.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/messaging/hello")
    String sayHello() {
        return "Hello World";
    }

}