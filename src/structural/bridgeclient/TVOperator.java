package structural.bridgeclient;

import structural.bridge.RemoteControl;
import structural.bridge.RemoteControlImpl;
import structural.businessobjects.PhilipsTV;
import structural.businessobjects.SonyTV;
import structural.businessobjects.TV;

public class TVOperator {

	public static void main(String[] args) {
		
		RemoteControl remoteControl = new RemoteControlImpl();
		TV tv = new SonyTV();
		remoteControl.setTv(tv);
		remoteControl.on();
		remoteControl.off();
		remoteControl.setChannel(5);
		
		
		TV secondTV = new PhilipsTV();
		remoteControl.setTv(secondTV);
		remoteControl.on();
		remoteControl.off();
		remoteControl.setChannel(5);
		
	}
	
}
