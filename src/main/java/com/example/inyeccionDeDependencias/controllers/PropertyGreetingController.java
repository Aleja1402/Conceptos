package com.example.inyeccionDeDependencias.controllers;

import com.example.inyeccionDeDependencias.services.GreetingService;

public class PropertyGreetingController {

    public GreetingService greetingService;

    public String greeting() {
        String greeting = greetingService.greeting();
        System.out.println(greeting);
        return greeting;
    }

}
