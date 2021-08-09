package springguru.springframework.sfgdiexample.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import springguru.springframework.sfgdiexample.services.ConstructorInjectedGreetingService;

class PropertyInjectedControllerTest {
    PropertyInjectedController injectedController;

    @BeforeEach
    void setUp() {
        injectedController = new PropertyInjectedController();
        injectedController.greetingService = new ConstructorInjectedGreetingService();
    }

    @Test
    void getGreeting() {
        System.out.println(injectedController.getGreeting());
    }
}