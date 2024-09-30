package com.example.inyeccionDeDependencias.controllers;

import com.example.inyeccionDeDependencias.services.ConstructorGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorGreetingControllerTest {

    ConstructorGreetingController constructorGreetingController;

    @BeforeEach
    void setUp() {
        constructorGreetingController = new ConstructorGreetingController(new ConstructorGreetingServiceImpl());
    }

    @Test
    void greeting() {
        constructorGreetingController.greeting();
    }
}