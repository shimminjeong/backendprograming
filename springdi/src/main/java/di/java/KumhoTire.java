package di.java;

import org.springframework.stereotype.Component;

@Component("kumhoTire")
public class KumhoTire implements Tire{

	public String getTireBrand() {
		// TODO Auto-generated method stub
		return "금호타이어";
	}
	
	

}
