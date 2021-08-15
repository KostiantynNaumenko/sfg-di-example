package springguru.springframework.sfgdiexample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springguru.springframework.sfgdiexample.pets.controllers.PetController;
import springguru.springframework.sfgdiexample.pets.services.PetService;
import springguru.springframework.sfgdiexample.pets.services.PetServiceFactory;

@Configuration
public class PetServiceConfig {

    @Bean
    PetServiceFactory petServiceFactory(){
        return new PetServiceFactory();
    }

    @Bean
    @Profile({"dog", "default"})
    PetService dogPetService(PetServiceFactory petServiceFactory) {
        return petServiceFactory.getPetService("dog");
    }

    @Bean
    @Profile("cat")
    PetService catPetService(PetServiceFactory petServiceFactory) {
        return petServiceFactory.getPetService("cat");
    }

    @Bean
    PetController petController(PetService petService) {
        return new PetController(petService);
    }
}
