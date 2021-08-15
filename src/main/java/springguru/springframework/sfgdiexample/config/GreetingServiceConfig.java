package springguru.springframework.sfgdiexample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springguru.springframework.sfgdiexample.services.ConstructorInjectedGreetingService;
import springguru.springframework.sfgdiexample.services.PropertyInjectedGreetingService;
import springguru.springframework.sfgdiexample.services.SetterInjectedGreetingService;

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

    /*@Bean
    I18nEnglishGreetingService i18nEnglishGreetingService(){
        return new I18nEnglishGreetingService();
    }

    @Bean
    I18nSpanishGreetingService i18nSpanishGreetingService(){
        return new I18nSpanishGreetingService();
    }

    @Bean
    I18nUkrainianGreetingService i18nUkrainianGreetingService(){
        return new I18nUkrainianGreetingService();
    }*/
}
