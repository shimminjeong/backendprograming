package basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloMain {
	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("basic-beanContainer.xml");
	
		Hello h1 = (Hello)context.getBean("h1");	
		h1.printHello();
		
//		Hello h2 = (Hello)context.getBean(Hello.class);	
//		h2.printHello();
		
		Hello h3 = (Hello)context.getBean("h2",Hello.class);	
		h3.printHello();
		
		System.err.println(h1);
//		System.err.println(h2);
		System.err.println(h3);
	}
}
