package creational.businessobjects;

public class PlasticBallBat implements Bat {

	private String logo;
	private String grip;

	public PlasticBallBat() {
		System.out.println("Creating Plastic Ball Bat.");
	}

	@Override
	public void setLogo(String logo) {
		// TODO Auto-generated method stub
		this.logo = logo;
		System.out.println("Logo: "+logo);
	}

	@Override
	public void setGrip(String grip) {
		// TODO Auto-generated method stub
		this.grip = grip;
		System.out.println("grip: "+grip);
	}
}
