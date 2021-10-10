package com.test.demo.controller;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.PublicKey;

@RestController
public class HelloWorldController {
    @ResponseBody
    @RequestMapping("/hi")
    public String sayHello(){
        return "Hello world ";
    }
}