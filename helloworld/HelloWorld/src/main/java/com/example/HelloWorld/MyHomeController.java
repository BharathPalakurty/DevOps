package com.example.HelloWorld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MyHomeController {
    @RequestMapping("/")
    public String myhome(){
        return "Hello World!";
    }
}