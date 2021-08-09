package springguru.springframework.sfgdiexample.controllers;

import springguru.springframework.sfgdiexample.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
