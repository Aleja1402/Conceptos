package com.example.inyeccionDeDependencias.controllers;

import com.example.inyeccionDeDependencias.services.GreetingService;
import com.example.inyeccionDeDependencias.services.SetterGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterGreetingControllerTest {

    SetterGreetingController setterGreetingController;

    @BeforeEach
    void setUp() {
        setterGreetingController = new SetterGreetingController();
        setterGreetingController.setGreetingService(new SetterGreetingServiceImpl());
    }

    @Test
    void greeting() {
        setterGreetingController.greeting();
    }

}