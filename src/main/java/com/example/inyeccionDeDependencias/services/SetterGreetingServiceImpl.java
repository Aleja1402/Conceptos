package com.example.inyeccionDeDependencias.services;

public class SetterGreetingServiceImpl implements GreetingService {

    @Override
    public String greeting() {
        String greeting = "Greeting from SetterGreetingServiceImpl";
        System.out.println(greeting);
        return greeting;
    }

}
