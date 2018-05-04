package com.rushedstudio.didemo.controllers;

import com.rushedstudio.didemo.services.GreetingService;
import com.rushedstudio.didemo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    @Autowired
    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingServiceImpl greetingService){
        this.greetingService = greetingService;
    }
}
