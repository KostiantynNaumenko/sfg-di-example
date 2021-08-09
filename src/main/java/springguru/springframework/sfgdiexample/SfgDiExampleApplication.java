package springguru.springframework.sfgdiexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import springguru.springframework.sfgdiexample.controllers.MyController;

@SpringBootApplication
public class SfgDiExampleApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiExampleApplication.class, args);
		MyController myController = (MyController) ctx.getBean(MyController.class);

		System.out.println(myController.sayHello());
	}

}
