package structural.decorator;

import structural.businessobjects.IceCream;

public class HoneyDecoratorForIceCream extends IceCreamDecorator {

	public HoneyDecoratorForIceCream(IceCream iceCream) {
		super(iceCream);
		// TODO Auto-generated constructor stub
	}

	public String makeIceCream() {
		return specialIceCream.makeIceCream() + addHoney();
	}

	private String addHoney() {
		return "+ Honey";
	}

}
