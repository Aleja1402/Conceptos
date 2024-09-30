package com.example.inyeccionDeDependencias.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class FirstController {

    public String greetingAlejandra() {
        String greeting = "Hello alejandra";
        System.out.println(greeting);
        return greeting;
    }

}
