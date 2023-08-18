package di.ex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import di.ex1.Config;

public class ExMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		SamsungTv stv = context.getBean("samsungTv",SamsungTv.class);
		LgTv ltv=context.getBean("lgTv",LgTv.class);
		
		XyzSpeaker xyz=context.getBean("xyzSpeaker",XyzSpeaker.class);
		AbcSpeaker abc=context.getBean("abcSpeaker",AbcSpeaker.class);


		stv.turnOn();
		stv.printSpeakerBrand();

		System.out.println("speakerbrand : "+xyz.getSpeakerBrand());
		xyz.volumneUp();
		xyz.volumneDown();

		System.out.println("speakerbrand : "+abc.getSpeakerBrand());
		abc.volumneUp();
		abc.volumneDown();
//		stv.turnOff();

	}

}
