package di.ex2_4;

import org.springframework.stereotype.Component;

@Component("subCalculator")
public class SubCalculator implements Calculator {

	@Override
	public int calculate(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1 - n2;
	}

}
