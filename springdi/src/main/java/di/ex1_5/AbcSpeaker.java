package di.ex1_5;

import org.springframework.stereotype.Component;

@Component("abcSpeaker")
public class AbcSpeaker implements Speaker {

	public void volumneUp() {
		System.out.println("speaker volumneUp");
	}

	public void volumneDown() {
		System.out.println("speaker volumneDown");

	}


	public String getSpeakerBrand() {
		return "ABC speaker";
	}

}
