package com.lucaslearning.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
    @GetMapping("/")
    public String sayHello() {
        return "Hello, World!";
    }

    @GetMapping("/about")
    public String aboutMe() {
        return "About me";
    }
}