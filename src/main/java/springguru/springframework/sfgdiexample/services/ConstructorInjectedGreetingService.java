package springguru.springframework.sfgdiexample.services;

public class ConstructorInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}
