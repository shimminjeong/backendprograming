package di.ex2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import di.ex2.Config;

public class CalMain {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		MyCalculator myCalculator = context.getBean("myCalculator", MyCalculator.class);
		myCalculator.printResult();

	}

}
