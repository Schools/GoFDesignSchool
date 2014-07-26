package creational.factory;

import creational.abstractfactory.AbstractFactory;
import creational.builder.BatBuilder;
import creational.businessobjects.Bat;
import creational.businessobjects.HardBallBat;
import creational.businessobjects.PlasticBallBat;
import creational.businessobjects.SoftBallBat;

public class BatFactory extends AbstractFactory{

	/*
	 * Factory method to create Bat.
	 */
	public Bat createBat(String requiredBat) {
		Bat bat = null;
		
		if(requiredBat.equals("HardBallBat"))
			bat = new HardBallBat();
		else if (requiredBat.equals("SoftBallBat"))
			bat = new SoftBallBat();
		else if (requiredBat.equals("PlasticBallBat"))
			bat = new PlasticBallBat();
				
		return bat;	
	}

	@Override
	public BatBuilder getBatBuilder(Bat bat) {
		// TODO Auto-generated method stub
		return null;
	}

}
