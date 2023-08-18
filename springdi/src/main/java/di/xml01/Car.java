package di.xml01;

import java.util.List;
import java.util.Map;

public class Car {
	
	private Tire tire;
	private String carName;
	private int year;
	private List<String> driver;
	private Map<String, String> map; 
	
	public Car() {
		System.out.println("car() 의 생성자입니다.");
	}
	
	public Car(Tire t) {
		this.tire=t;
		System.out.println("car(Tire t)의 생성자입니다.");
	}
	
	public Car(String carname,Tire t) {
		this.tire=t;
		System.out.println("car(String carname,Tire t)의 생성자입니다.");
	}
	
//	public Car(Tire t,String carname) {
//		this.tire=t;
//		System.out.println("car(Tire t,String carname)의 생성자입니다.");
//	}
	
	public Car(String carname,int year,Tire t) {
		this.tire=t;
		System.out.println("car(String carname,int year,Tire t)의 생성자입니다.");
	}
	

	public List<String> getDriver() {
		return driver;
	}

	public void setDriver(List<String> driver) {
		this.driver = driver;
	}
	

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public void printTireBrand() {
		System.out.println("타이어 브랜드는  "+ tire.getTireBrand());
	}

}
