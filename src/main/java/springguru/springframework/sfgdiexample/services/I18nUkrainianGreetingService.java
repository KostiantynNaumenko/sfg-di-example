package springguru.springframework.sfgdiexample.services;

public class I18nUkrainianGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Привіт світ - UA (default)";
    }
}
