package di.xml02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DriverMain {

	public static void main(String[] args) {

		ApplicationContext context = new GenericXmlApplicationContext("spring-xml02.xml"); // bean 정의해준거 사용하기위해
//		1. setter를 이용한 주입
		Car c1 = context.getBean("car",Car.class);
		c1.printTireBrand();
		System.out.println(c1.toString());

	}

}
