package springguru.springframework.sfgdiexample.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import springguru.springframework.sfgdiexample.services.GreetingServiceImpl;

class SetterInjectedControllerTest {
    SetterInjectedController injectedController;

    @BeforeEach
    void setUp() {
        injectedController = new SetterInjectedController();
        injectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(injectedController.getGreeting());
    }
}