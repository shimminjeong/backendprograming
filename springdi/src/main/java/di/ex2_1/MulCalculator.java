package di.ex2_1;

import org.springframework.stereotype.Component;

public class MulCalculator implements Calculator {

	@Override
	public int calculate(int n1, int n2) {
		return n1 * n2;
	}

}
