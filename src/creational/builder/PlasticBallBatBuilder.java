package creational.builder;

import creational.businessobjects.Bat;

public class PlasticBallBatBuilder extends BatBuilder {

	private Bat bat;

	public PlasticBallBatBuilder(Bat bat) {
		this.bat = bat;
	}

	@Override
	public void clean() {
		// TODO Auto-generated method stub
		System.out.println("Cleaning PlasticBallBat");
	}

	@Override
	public void applyLogo() {
		// TODO Auto-generated method stub
		bat.setLogo("THE PLASTIC BAT");
		System.out.println("Applying Logo to PlasticBallBat");
	}

	@Override
	public void applyGrip() {
		// TODO Auto-generated method stub
		bat.setGrip("PLASTIC GRIP");
		System.out.println("Applying Grip to PlasticBallBat");
	}

	@Override
	public void applyCover() {
		// TODO Auto-generated method stub
		System.out.println("Applying Cover to PlasticBallBat");
	}

	@Override
	public void pack() {
		// TODO Auto-generated method stub
		System.out.println("Packing PlasticBallBat");
	}
	

}
