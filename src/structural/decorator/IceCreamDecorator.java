package structural.decorator;

import structural.businessobjects.IceCream;

public abstract class IceCreamDecorator implements IceCream {

	protected IceCream specialIceCream;

	// Constructor Injection.
	public IceCreamDecorator(IceCream iceCream) {
		this.specialIceCream = iceCream;
	}
	
	public abstract String makeIceCream();
}
