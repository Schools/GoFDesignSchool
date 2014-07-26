package structural.decorator;

import structural.businessobjects.IceCream;

public class NutsDecoratorForIceCream extends IceCreamDecorator {

	public NutsDecoratorForIceCream(IceCream iceCream) {
		super(iceCream);
		// TODO Auto-generated constructor stub
	}

	public String makeIceCream() {
		return specialIceCream.makeIceCream() + addNuts();
	}

	private String addNuts() {
		return "+ Nuts";
	}

}
