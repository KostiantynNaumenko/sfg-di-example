package springguru.springframework.sfgdiexample.repositories;

public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {
    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
