package springguru.springframework.sfgdiexample.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import springguru.springframework.sfgdiexample.services.ConstructorInjectedGreetingService;

class ConstructorInjectedControllerTest {
    private ConstructorInjectedController injectedController;

    @BeforeEach
    void setUp() {
        injectedController = new ConstructorInjectedController(new ConstructorInjectedGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(injectedController.getGreeting());
    }
}