package creational.builder;

import creational.businessobjects.Bat;

public class HardBallBatBuilder extends BatBuilder {

	private Bat bat;

	public HardBallBatBuilder(Bat bat) {
		this.bat = bat;
	}

	@Override
	public void clean() {
		// TODO Auto-generated method stub
		System.out.println("Cleaning HardBallBat");
	}

	@Override
	public void applyLogo() {
		// TODO Auto-generated method stub
		bat.setLogo("THE HARD BAT");
		System.out.println("Applying Logo to HardBallBat");
	}

	@Override
	public void applyGrip() {
		// TODO Auto-generated method stub
		bat.setGrip("HARD GRIP");
		System.out.println("Applying Grip to HardBallBat");
	}

	@Override
	public void applyCover() {
		// TODO Auto-generated method stub
		System.out.println("Applying Cover to HardBallBat");
	}

	@Override
	public void pack() {
		// TODO Auto-generated method stub
		System.out.println("Packing HardBallBat");
	}
	

}
