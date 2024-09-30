package com.example.inyeccionDeDependencias.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceImpl implements GreetingService {

    @Override
    public String greeting() {
        String greeting = "Greeting from ConstructorGreetingServiceImpl";
        System.out.println(greeting);
        return greeting;
    }

}
