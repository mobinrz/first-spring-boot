package com.example.firstsprintbootproject.controller;

import com.example.firstsprintbootproject.Topic;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String sayHello(){
        return "HELLO SPRING BOOT - JAVA";
    }
}
