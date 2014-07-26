package structural.businessobjects;

public class SonyTV implements TV {
	
	public void on() {
		System.out.println("Switch On Sony TV");
	}

	public void off() {
		System.out.println("Switch Off Sony TV");
	}

	public void tuneChannel(int channel) {
		System.out.println("Tune to Channel "+channel+ " in Sony TV");
	}
}
