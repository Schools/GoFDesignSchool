package creational.businessobjects;

import java.util.Date;

public class SoftBallBat implements Bat, Cloneable {

	private String logo;
	private String grip;
	
	private Date date;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getLogo() {
		return logo;
	}

	public String getGrip() {
		return grip;
	}

	public SoftBallBat() {
		System.out.println("Creating Soft Ball Bat.");
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
	
	//Copy Constructor
	public SoftBallBat(SoftBallBat bat){
		this.setGrip(bat.getGrip());
		this.setLogo(bat.getLogo());
		this.setDate(bat.getDate());
	}

	//Conversion Constructor
	public SoftBallBat(HardBallBat bat){
		this.setGrip(bat.getGrip());
		this.setLogo(bat.getLogo());
		this.setDate(new Date());
	}
	
	//Copy Method
	public SoftBallBat copySoftBallBat(SoftBallBat bat){
		bat.setGrip(this.grip);
		bat.setLogo(this.logo);
		bat.setDate(this.date);
		return bat;
	}
	
	//Defensively Coping Method
	public SoftBallBat copyDefensivelySoftBallBat(SoftBallBat bat){
		bat.setGrip(this.grip);
		bat.setLogo(this.logo);
		bat.setDate(new Date());
		return bat;
	}
	
	//Copy Factory 
	public SoftBallBat copyFactory()
	{
		SoftBallBat bat = new SoftBallBat();
		bat.setGrip(this.grip);
		bat.setLogo(this.logo);
		bat.setDate(this.date);
		return bat;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		//this.date = new Date();
		return super.clone();
	}
	
}
