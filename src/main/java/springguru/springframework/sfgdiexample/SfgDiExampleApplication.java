package springguru.springframework.sfgdiexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import springguru.springframework.sfgdiexample.controllers.*;

@SpringBootApplication
public class SfgDiExampleApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiExampleApplication.class, args);

		System.out.println("----- Profiles -----");
		I18nController i18nController = ctx.getBean(I18nController.class);
		System.out.println(i18nController.sayGreeting());
		System.out.println();

		System.out.println("----- Primary -----");
		MyController myController = ctx.getBean(MyController.class);
		System.out.println(myController.sayGreeting());
		System.out.println();

		System.out.println("----- Property -----");
		PropertyInjectedController propertyInjectedController = ctx.getBean(PropertyInjectedController.class);
		System.out.println(propertyInjectedController.getGreeting());
		System.out.println();

		System.out.println("----- Setter -----");
		SetterInjectedController setterInjectedController = ctx.getBean(SetterInjectedController.class);
		System.out.println(setterInjectedController.getGreeting());
		System.out.println();

		System.out.println("----- Constructor -----");
		ConstructorInjectedController constructorInjectedController = ctx.getBean(ConstructorInjectedController.class);
		System.out.println(constructorInjectedController.getGreeting());
		System.out.println();

		System.out.println("----- External Properties -----");
		FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getUsername());
		System.out.println(fakeDataSource.getPassword());
		System.out.println(fakeDataSource.getJdbcurl());
		System.out.println();
	}
}
