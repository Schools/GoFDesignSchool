package creational.factory;

import creational.builder.BatBuilder;
import creational.builder.HardBallBatBuilder;
import creational.builder.PlasticBallBatBuilder;
import creational.builder.SoftBallBatBuilder;
import creational.businessobjects.Bat;
import creational.businessobjects.HardBallBat;
import creational.businessobjects.PlasticBallBat;
import creational.businessobjects.SoftBallBat;


public class Factory {
	
	/*
	 * Factory method to create Bat.
	 */
	public Bat createBat(String requiredBat)
	{
		Bat bat = null;
	
		if(requiredBat.equals("HardBallBat"))
			bat = new HardBallBat();
		else if (requiredBat.equals("SoftBallBat"))
			bat = new SoftBallBat();
		else if (requiredBat.equals("PlasticBallBat"))
			bat = new PlasticBallBat();
				
		return bat;	
	}
	
	/*
	 * Factory Method to get Bat Builders for a given Bat.
	 */
	public BatBuilder getBatBuilder(Bat bat)
	{
		BatBuilder batBuilder = null;
		if(bat instanceof HardBallBat)
			batBuilder = new HardBallBatBuilder(bat);
		else if (bat instanceof PlasticBallBat)
			batBuilder = new PlasticBallBatBuilder(bat);
		else if (bat instanceof SoftBallBat)
			batBuilder = new SoftBallBatBuilder(bat);

		return batBuilder;	
	}
}
