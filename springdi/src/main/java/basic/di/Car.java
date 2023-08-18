package basic.di;

public class Car {
	
	private Tire tire;
	
	public Car() {
		System.out.println("car() 의 생성자입니다.");
	}
	
	public Car(Tire t) {
		this.tire=t;
		System.out.println("car(Tire t)의 생성자입니다.");
	}

	public Tire getTire() {
		return tire;
	}

	public void setTire(Tire tire) {
		System.out.println("setTire(Tire t)의 생성자입니다.");
		this.tire = tire;
	}
	
	public void printTireBrand() {
		System.out.println("타이어 브랜드는  "+ tire.getTireBrand());
	}

}
