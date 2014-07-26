package creational.factory;

import java.lang.reflect.Constructor;
import java.util.HashMap;

import creational.businessobjects.Bat;

public class FactoryWithRegistry {

	@SuppressWarnings("rawtypes")
	private HashMap batRegistry = new HashMap();

	@SuppressWarnings("unchecked")
	public void registerBat(String batName, Bat bat) {
		batRegistry.put(batName, bat);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void registerBatWithReflection(String batName, Class batClass) {
		batRegistry.put(batName, batClass);
	}

	public Bat createBat(String requiredBat) {
		Bat bat = (Bat) batRegistry.get(requiredBat);

		return bat;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Bat createBatWithReflection(String requiredBat) throws Exception {
		Class batClass = (Class) batRegistry.get(requiredBat);
		Constructor batConstructor = batClass
				.getDeclaredConstructor(new Class[] { String.class });
		Bat bat = (Bat) batConstructor.newInstance(new Object[] {});
		return bat;
	}

}
