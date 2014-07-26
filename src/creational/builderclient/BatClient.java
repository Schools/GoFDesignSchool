package creational.builderclient;

import creational.builder.BatBuilder;
import creational.businessobjects.Bat;
import creational.factory.Factory;

public class BatClient {

	public static void main(String[] args) {
		Factory factory = new Factory();
		Bat bat = factory.createBat("SoftBallBat");
		BatBuilder batBuilder = factory.getBatBuilder(bat);
		Bat newPackedBat = batBuilder.buildBat(bat);
	}

}
