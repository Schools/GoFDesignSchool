package structural.bridge;

import structural.businessobjects.TV;

public abstract class RemoteControl {

	private TV tv;

	public TV getTv() {
		return tv;
	}

	public void setTv(TV tv) {
		this.tv = tv;
	}

	public void on() {
		tv.on();
	}

	public void off() {
		tv.off();
	}

	public void setChannel(int channel) {
		tv.tuneChannel(channel);
	}

}
