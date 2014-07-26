package creational.factoryclient;

import creational.businessobjects.Bat;
import creational.businessobjects.HardBallBat;
import creational.businessobjects.PlasticBallBat;
import creational.businessobjects.SoftBallBat;
import creational.factory.Factory;
import creational.factory.FactoryWithRegistry;

public class BatClient {
	
	public static void main(String[] args) {
		Factory factory = new Factory();
		@SuppressWarnings("unused")
		Bat bat = factory.createBat("SoftBallBat");
		
		
		FactoryWithRegistry factoryWithRegistry = new FactoryWithRegistry();
		
		factoryWithRegistry.registerBat("HardBallBat", new HardBallBat());
		factoryWithRegistry.registerBat("SoftBallBat", new SoftBallBat());
		factoryWithRegistry.registerBat("PlasticBallBat", new PlasticBallBat());
		System.out.println("After registration 1");
		factoryWithRegistry.registerBatWithReflection("HardBallBatClass", HardBallBat.class);
		factoryWithRegistry.registerBatWithReflection("SoftBallBatClass", SoftBallBat.class);
		factoryWithRegistry.registerBatWithReflection("PlasticBallBatClass", PlasticBallBat.class);
		System.out.println("After registration 2");
		@SuppressWarnings("unused")
		Bat batWithRegistry = factoryWithRegistry.createBat("SoftBallBat");
		
	}

}
