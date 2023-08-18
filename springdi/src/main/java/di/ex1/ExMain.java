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


		System.out.println(stv.getBrand());
		stv.turnOn();
		stv.printSpeakerBrand();
		

		System.out.println();
		System.out.print(xyz.getSpeakerBrand());
		System.out.println();
		xyz.volumneUp();
		xyz.volumneDown();
		System.out.println();
		System.out.println(abc.getSpeakerBrand());
		abc.volumneUp();
		abc.volumneDown();
		System.out.println();
		stv.turnOff();

	}

}
