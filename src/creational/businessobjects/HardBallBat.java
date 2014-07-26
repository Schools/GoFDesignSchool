package creational.businessobjects;

public class HardBallBat implements Bat {

	@SuppressWarnings("unused")
	private String logo;

	@SuppressWarnings("unused")
	private String grip;

	public HardBallBat() {
		System.out.println("Creating Hard Ball Bat.");
	}

	@Override
	public void setLogo(String logo) {
		// TODO Auto-generated method stub
		this.logo = logo;
		System.out.println("Logo: " + logo);
	}

	@Override
	public void setGrip(String grip) {
		// TODO Auto-generated method stub
		this.grip = grip;
		System.out.println("grip: " + grip);
	}

	public String getLogo() {
		return logo;
	}

	public String getGrip() {
		return grip;
	}



}
