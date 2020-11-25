package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        // mailSender.send("santosh@abc.com", "test mail", "hi this is test moack
        // mail");
        return "hello world";

    }

}
