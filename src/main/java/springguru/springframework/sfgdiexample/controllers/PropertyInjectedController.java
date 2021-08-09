package springguru.springframework.sfgdiexample.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import springguru.springframework.sfgdiexample.services.GreetingService;

@Controller
public class PropertyInjectedController {
    @Autowired
    @Qualifier("propertyInjectedGreetingService")
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
