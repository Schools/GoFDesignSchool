package creational.abstractfactoryclient;

import creational.abstractfactory.AbstractFactory;
import creational.builder.BatBuilder;
import creational.businessobjects.Bat;
import creational.factory.BatBuilderFactory;
import creational.factory.BatFactory;
import creational.factory.Factory;

public class BatClient {

	public static void main(String[] args) {
		AbstractFactory factory = AbstractFactory.getFactory("BatFactory");
		Bat bat = factory.createBat("SoftBallBat");
		AbstractFactory batBuilderFactory = AbstractFactory.getFactory("BatBuilderFactory");
		BatBuilder batBuilder = batBuilderFactory.getBatBuilder(bat);
		Bat newPackedBat = batBuilder.buildBat(bat);
	}

}
