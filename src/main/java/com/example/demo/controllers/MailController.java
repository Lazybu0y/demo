package com.example.demo.controllers;

import com.example.demo.mail.MailSender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {
    @Autowired
    private MailSender mailSender;

    @RequestMapping("/mail")
    public String mail() {
        mailSender.send("santosh@abc.com", "test mail", "hi this is test moack mail");
        return "mail sent";
    }
}
