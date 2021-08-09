package springguru.springframework.sfgdiexample.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("default")
@Service("i18nGreetingService")
public class I18nUkrainianGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Привіт світ - UA";
    }
}
