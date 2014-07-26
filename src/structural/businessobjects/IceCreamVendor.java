package structural.businessobjects;

import java.util.List;

import structural.decorator.HoneyDecoratorForIceCream;
import structural.decorator.NutsDecoratorForIceCream;

public class IceCreamVendor {

	private IceCreamVendor() {

	}

	public static IceCreamVendor getIceCreamVendor() {
		return new IceCreamVendor();
	}

	public String getIceCream(List<String> icreamOrder) {
		return iceCreamDecoratorFactory(icreamOrder);
	}

	private String iceCreamDecoratorFactory(List<String> condiments) {
		String myIceCream = null;

		IceCream iceCream = new SimpleIceCream();
		for (String condiment : condiments) {
			if (condiment.equals("Nuts")) {
				iceCream = new NutsDecoratorForIceCream(iceCream);
			} else if (condiment.equals("Honey")) {
				iceCream = new HoneyDecoratorForIceCream(iceCream);
			}
		}
		myIceCream = iceCream.makeIceCream();

		return myIceCream;
	}

}
