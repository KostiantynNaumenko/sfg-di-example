package springguru.springframework.sfgdiexample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import springguru.springframework.sfgdiexample.services.*;

@Configuration
public class GreetingServiceConfig {

    @Bean
    ConstructorInjectedGreetingService constructorInjectedGreetingService(){
        return new ConstructorInjectedGreetingService();
    }

    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService(){
        return new SetterInjectedGreetingService();
    }

    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService(){
        return new PropertyInjectedGreetingService();
    }

    @Bean
    @Primary
    PrimaryGreetingService primaryGreetingService(){
        return new PrimaryGreetingService();
    }

    @Profile("EN")
    @Bean("i18nGreetingService")
    I18nEnglishGreetingService i18nEnglishGreetingService(){
        return new I18nEnglishGreetingService();
    }

    @Profile("ES")
    @Bean("i18nGreetingService")
    I18nSpanishGreetingService i18nSpanishGreetingService(){
        return new I18nSpanishGreetingService();
    }

    @Profile("default")
    @Bean("i18nGreetingService")
    I18nUkrainianGreetingService i18nUkrainianGreetingService(){
        return new I18nUkrainianGreetingService();
    }
}
