package creational.factory;

import creational.abstractfactory.AbstractFactory;
import creational.builder.BatBuilder;
import creational.builder.HardBallBatBuilder;
import creational.builder.PlasticBallBatBuilder;
import creational.builder.SoftBallBatBuilder;
import creational.businessobjects.Bat;
import creational.businessobjects.HardBallBat;
import creational.businessobjects.PlasticBallBat;
import creational.businessobjects.SoftBallBat;

public class BatBuilderFactory extends AbstractFactory{
	/*
	 * Factory Method to get Bat Builders for a given Bat.
	 */
	public BatBuilder getBatBuilder(Bat bat) {
		BatBuilder batBuilder = null;
		if (bat instanceof HardBallBat)
			batBuilder = new HardBallBatBuilder(bat);
		else if (bat instanceof PlasticBallBat)
			batBuilder = new PlasticBallBatBuilder(bat);
		else if (bat instanceof SoftBallBat)
			batBuilder = new SoftBallBatBuilder(bat);

		return batBuilder;
	}

	@Override
	public Bat createBat(String requiredBat) {
		// TODO Auto-generated method stub
		return null;
	}
}
