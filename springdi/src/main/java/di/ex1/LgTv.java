package di.ex1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class LgTv implements Tv {

	private Speaker leftSpeaker;
	private Speaker rightSpeaker;

	@Autowired
	public LgTv(@Qualifier("abcSpeaker") Speaker leftSpeaker, @Qualifier("xyzSpeaker") Speaker rightSpeaker) {
		this.leftSpeaker = leftSpeaker;
		this.rightSpeaker = rightSpeaker;
	}
	
	public String getBrand() {
		return "lgtv";
	}

	public Speaker getLeftSpeaker() {
		return leftSpeaker;
	}

	public void setLeftSpeaker(Speaker leftSpeaker) {
		this.leftSpeaker = leftSpeaker;
	}

	public Speaker getRightSpeaker() {
		return rightSpeaker;
	}

	public void setRightSpeaker(Speaker rightSpeaker) {
		this.rightSpeaker = rightSpeaker;
	}

	public void turnOn() {
		System.out.println("tv turnOn");

	}

	public void turnOff() {
		System.out.println("tv turnOff");

	}

	public void printSpeakerBrand() {
		System.out.println("left " + leftSpeaker.getSpeakerBrand() + "right " + rightSpeaker.getSpeakerBrand());
	}

	public void volumeUp() {
		System.out.println("tv volumneup");

	}

	public void volumeDown() {
		System.out.println("tv volumnedown");

	}

}
