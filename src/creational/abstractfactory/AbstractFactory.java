package creational.abstractfactory;

import creational.builder.BatBuilder;
import creational.businessobjects.Bat;
import creational.factory.BatBuilderFactory;
import creational.factory.BatFactory;

public abstract class AbstractFactory {

	private static AbstractFactory abstractFactory = null;

	public static AbstractFactory getFactory(String factoryName)

	{
		if (factoryName.equals("BatFactory")) {
			abstractFactory = new BatFactory();
		} else if (factoryName.equals("BatBuilderFactory")) {
			abstractFactory = new BatBuilderFactory();
		}

		return abstractFactory;
	}
	
	public abstract Bat createBat(String requiredBat);
	
	public abstract BatBuilder getBatBuilder(Bat bat);
	

}
