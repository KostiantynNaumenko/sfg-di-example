package springguru.springframework.sfgdiexample.controllers;

import org.springframework.stereotype.Controller;
import springguru.springframework.sfgdiexample.services.GreetingService;

@Controller
public class MyController {
    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayGreeting(){
        return greetingService.sayGreeting();
    }
}
