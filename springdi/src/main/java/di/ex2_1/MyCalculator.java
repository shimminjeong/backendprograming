package di.ex2_1;

import org.springframework.beans.factory.annotation.Autowired;


public class MyCalculator {

	int firstNum=2;
	int secondNum=3;
	
	private Calculator calculator;
	
	public MyCalculator() {
		System.out.println("MyCalculator()의 생성자입니다.");

	}

	
	public MyCalculator(Calculator calculator) {
		this.calculator = calculator;
		System.out.println("MyCalculator(Calculator calculator)의 생성자입니다.");
	}

	

	public int getFirstNum() {
		return firstNum;
	}

	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}

	public int getSecondNum() {
		return secondNum;
	}

	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}

	public Calculator getCalculator() {
		return calculator;
	}

	@Autowired
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
		System.out.println("MyCalculator(Calculator calculator)의 생성자입니다.");
	}

	public void printResult() {
		System.out.println("결과는" + calculator.calculate(firstNum,secondNum));
	}

}
