package basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Hello {
	public Hello() {
		System.out.println("hello  생성자");
	}
	
	public void printHello() {
		System.out.println("hello world");
	}

}
