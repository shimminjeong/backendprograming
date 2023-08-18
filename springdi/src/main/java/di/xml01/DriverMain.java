package di.xml01;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DriverMain {

	public static void main(String[] args) {

		ApplicationContext context = new GenericXmlApplicationContext("spring-xml01.xml"); // bean 정의해준거 사용하기위해
//		1. 생성자 주입
//		Car c1= new Car(new HankookTire());
		Car car = (Car) context.getBean("car");
        Car car1 = (Car) context.getBean("car1");
        Car car2 = (Car) context.getBean("car2");
        Car car3 = (Car) context.getBean("car3");
        Car car4 = (Car) context.getBean("car4");
        Car car5 = (Car) context.getBean("car5");
        Car car6 = (Car) context.getBean("car6");

        car.printTireBrand();
        car1.printTireBrand();
        car2.printTireBrand();
        car3.printTireBrand();
        car4.printTireBrand();
        List<String> list = car5.getDriver();
        for(String str : list) {
        	System.out.println(str);
        }
        
        Map<String,String> map =car6.getMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        	

	}

}
