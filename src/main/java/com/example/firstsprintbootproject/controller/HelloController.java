package com.example.firstsprintbootproject.controller;

import com.example.firstsprintbootproject.service.Topic;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String sayHello(){
        return "HELLO";
    }

    @GetMapping("/topics")
    public List<Topic> topicList(){
        return Arrays.asList(
                new Topic("Java","Java Language","Java Language Description"),
                new Topic("Spring","Spring Framework","Spring Framework Description")
        );
    }
}
