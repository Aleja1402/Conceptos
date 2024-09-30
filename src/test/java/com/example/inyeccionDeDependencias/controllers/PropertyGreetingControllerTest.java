package com.example.inyeccionDeDependencias.controllers;

import com.example.inyeccionDeDependencias.services.GreetingService;
import com.example.inyeccionDeDependencias.services.PropertyGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyGreetingControllerTest {

    PropertyGreetingController propertyGreetingController;

    @BeforeEach
    void setUp() {
        propertyGreetingController = new PropertyGreetingController();
        propertyGreetingController.greetingService = new PropertyGreetingServiceImpl();
    }

    @Test
    void greeting() {
        propertyGreetingController.greeting();
    }

}