package springguru.springframework.sfgdiexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import springguru.springframework.sfgdiexample.controllers.ConstructorInjectedController;
import springguru.springframework.sfgdiexample.controllers.MyController;
import springguru.springframework.sfgdiexample.controllers.PropertyInjectedController;
import springguru.springframework.sfgdiexample.controllers.SetterInjectedController;

@SpringBootApplication
public class SfgDiExampleApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiExampleApplication.class, args);

		MyController myController = ctx.getBean(MyController.class);
		System.out.println(myController.sayHello());

		System.out.println("----- Property -----");
		PropertyInjectedController propertyInjectedController = ctx.getBean(PropertyInjectedController.class);
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("----- Setter -----");
		SetterInjectedController setterInjectedController = ctx.getBean(SetterInjectedController.class);
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("----- Constructor -----");
		ConstructorInjectedController constructorInjectedController = ctx.getBean(ConstructorInjectedController.class);
		System.out.println(constructorInjectedController.getGreeting());

	}

}
