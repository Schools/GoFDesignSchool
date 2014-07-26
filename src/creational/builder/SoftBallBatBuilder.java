package creational.builder;

import creational.businessobjects.Bat;

public class SoftBallBatBuilder extends BatBuilder {

	private Bat bat;
	
	public SoftBallBatBuilder(Bat bat){
		this.bat = bat;
	}
	
	@Override
	public void clean() {
		// TODO Auto-generated method stub
		System.out.println("Cleaning SoftBallBat");
	}

	@Override
	public void applyLogo() {
		// TODO Auto-generated method stub
		bat.setLogo("THE SOFT BAT");
		System.out.println("Apply Logo SoftBallBat");
	}

	@Override
	public void applyGrip() {
		// TODO Auto-generated method stub
		bat.setGrip("THE SOFT GRIP");
		System.out.println("Applying Grip to SoftBallBat");
	}

	@Override
	public void applyCover() {
		// TODO Auto-generated method stub
		System.out.println("Applying Cover to SoftBallBat");
	}

	@Override
	public void pack() {
		// TODO Auto-generated method stub
		System.out.println("Packing SoftBallBat");
	}

}
