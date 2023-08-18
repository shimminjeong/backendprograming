package di.xml02;

public class Car {

	private Tire tire;
	private Tire stire;

	private String carName;
	private int year;
	
	public Car() {
		System.out.println("car() 생성자입니다.");
	}
	
	
	public void setTire(Tire tire) {
		System.out.println("setTire(Tire tire) 입니다.");
		this.tire = tire;
	}

	public Tire getStire() {
		return stire;
	}

	public void setStire(Tire stire) {
		this.stire = stire;
	}

	public Tire getTire() {
		return tire;
	}

	

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void printTireBrand() {
		System.out.println("타이어 브랜드는  " + tire.getTireBrand());
		System.out.println("스페어타이어는 " + stire.getTireBrand());
	}

	@Override
	public String toString() {
		return "Car [tire=" + tire + ", stire=" + stire + ", carName=" + carName + ", year=" + year + "]";
	}

}
