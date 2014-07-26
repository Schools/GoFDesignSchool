package behavioural.chainofresponsibility;

import structural.businessobjects.IceCream;

public interface Chain {

	void setNext(Chain c);

	String process(IceCream icecream);
}
