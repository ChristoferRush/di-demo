package com.rushedstudio.didemo.controllers;

import com.rushedstudio.didemo.services.GreetingService;
import com.rushedstudio.didemo.services.GreetingServiceImpl;

public class SetterInjectedController {

    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingServiceImpl greetingService){
        this.greetingService = greetingService;
    }
}
