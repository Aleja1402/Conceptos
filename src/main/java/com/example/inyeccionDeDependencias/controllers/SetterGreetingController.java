package com.example.inyeccionDeDependencias.controllers;

import com.example.inyeccionDeDependencias.services.GreetingService;

public class SetterGreetingController {

    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String greeting() {
        String greeting = greetingService.greeting();
        System.out.println(greeting);
        return greeting;
    }

}
