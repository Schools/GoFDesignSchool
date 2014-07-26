package structural.businessobjects;

public class PhilipsTV implements TV {
	
	public void on() {
		System.out.println("Switch On Philips TV");
	}

	public void off() {
		System.out.println("Switch Off Philips TV");
	}

	public void tuneChannel(int channel) {
		System.out.println("Tune to Channel "+channel+ " in Philips TV");
	}
}