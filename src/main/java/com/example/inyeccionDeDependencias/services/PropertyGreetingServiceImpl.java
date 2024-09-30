package com.example.inyeccionDeDependencias.services;

public class PropertyGreetingServiceImpl implements GreetingService {

    @Override
    public String greeting() {
        String greeting = "Greeting from PropertyGreetingServiceImpl";
        System.out.println(greeting);
        return greeting;
    }

}
