package creational.prototypeclient;

import java.util.Date;

import creational.businessobjects.Bat;
import creational.businessobjects.SoftBallBat;

public class BatClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SoftBallBat softBallBat =new SoftBallBat();
		softBallBat.setDate(new Date());
		softBallBat.setLogo("THE Soft Bat");
		softBallBat.setGrip("THE Soft Grip");
		System.out.println(softBallBat.getDate().getTime());
		System.out.println(softBallBat.getDate().toString());
		SoftBallBat bat = new SoftBallBat();

		bat = softBallBat.copyDefensivelySoftBallBat(bat);
		System.out.println(bat.getLogo());
		System.out.println(bat.getGrip());
		System.out.println(bat.getDate().getTime());
		System.out.println(bat.getDate().toString());

		bat = new SoftBallBat();
		System.out.println(bat.getLogo());
		System.out.println(bat.getGrip());
		System.out.println(bat.getDate().getTime());
		System.out.println(bat.getDate().toString());
		
		try {
			bat = (SoftBallBat)softBallBat.clone();
			System.out.println(bat.getLogo());
			System.out.println(bat.getGrip());
			System.out.println(bat.getDate().getTime());
			System.out.println(bat.getDate().toString());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(softBallBat.getDate().getTime());
	}

}
