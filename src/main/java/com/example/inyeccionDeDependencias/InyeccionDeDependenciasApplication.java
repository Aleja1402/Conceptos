package com.example.inyeccionDeDependencias;

import com.example.inyeccionDeDependencias.controllers.ConstructorGreetingController;
import com.example.inyeccionDeDependencias.controllers.FirstController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class InyeccionDeDependenciasApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(InyeccionDeDependenciasApplication.class, args);
		FirstController firstController = (FirstController) context.getBean("firstController");
		firstController.greetingAlejandra();

		ConstructorGreetingController constructorGreetingController = (ConstructorGreetingController) context.getBean("constructorGreetingController");
		constructorGreetingController.greeting();

	}

}
