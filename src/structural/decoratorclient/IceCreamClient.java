package structural.decoratorclient;

import java.util.ArrayList;
import java.util.List;

import structural.businessobjects.IceCreamVendor;

public class IceCreamClient {

	public static void main(String[] args) {
		
		
		IceCreamVendor iceCreamVendor = IceCreamVendor.getIceCreamVendor();
		
		List<String> myIceCreamIncredients = new ArrayList<String>();
		myIceCreamIncredients.add("Honey");
		myIceCreamIncredients.add("Nuts");
		myIceCreamIncredients.add("Honey");
		String iceCream = iceCreamVendor.getIceCream(myIceCreamIncredients);
		System.out.println(iceCream);
	}
	
}
