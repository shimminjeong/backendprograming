package di.ex1_5;

import org.springframework.stereotype.Component;

@Component("xyzSpeaker")
public class XyzSpeaker implements Speaker {

	public void volumneUp() {
		System.out.println("speaker volumneUp");
	}

	public void volumneDown() {
		System.out.println("speaker volumneDown");

	}


	public String getSpeakerBrand() {
		// TODO Auto-generated method stub
		return "XYZ speaker";
	}

}
