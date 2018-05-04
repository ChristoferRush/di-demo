package com.rushedstudio.didemo.controllers;

import com.rushedstudio.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        System.out.println("Hello in console");
        return greetingService.sayGreeting();
    }
}
