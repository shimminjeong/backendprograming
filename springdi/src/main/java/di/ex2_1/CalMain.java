package di.ex2_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class CalMain {

	public static void main(String[] args) {

		ApplicationContext context = new GenericXmlApplicationContext("spring-ex2_1.xml");
		MyCalculator myCalculator = context.getBean("myCalculator", MyCalculator.class);
		myCalculator.printResult();

	}

}
