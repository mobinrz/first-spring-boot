package com.example.firstsprintbootproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String sayHello(){
        return "HELLO";
    }

    @GetMapping("/hi")
    public String sayHi(){
        return "HI";
    }
}
