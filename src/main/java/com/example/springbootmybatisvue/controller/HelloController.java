package com.example.springbootmybatisvue.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@Slf4j
public class HelloController {

    @RequestMapping("hello")
    public String home() {

       log.info("===Home Page===");

       return "Home page";

    }
}
