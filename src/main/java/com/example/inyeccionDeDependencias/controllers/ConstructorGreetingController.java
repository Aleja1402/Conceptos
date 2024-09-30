package com.example.inyeccionDeDependencias.controllers;

import com.example.inyeccionDeDependencias.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorGreetingController {

    private final GreetingService greetingService;

    public ConstructorGreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String greeting() {
        String greeting = greetingService.greeting();
        System.out.println(greeting);
        return greeting;
    }

}
